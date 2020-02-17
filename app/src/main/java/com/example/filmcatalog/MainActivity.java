package com.example.filmcatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected ImageView movieImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieImageView = findViewById(R.id.movie_image);
        ImageView movieIcon = findViewById(R.id.movie_image);

        movieIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.movie_icon));

        // Buttons
        Button btnGravity = findViewById(R.id.gravity);
        Button btnJumanji = findViewById(R.id.jumanji);
        Button btnLionKing = findViewById(R.id.lionKing);
        Button btnStarWars = findViewById(R.id.starWars);
        Button btnInception = findViewById(R.id.inception);
        Button btnToyStory = findViewById(R.id.toyStory);

        btnGravity.setOnClickListener(this);
        btnJumanji.setOnClickListener(this);
        btnLionKing.setOnClickListener(this);
        btnStarWars.setOnClickListener(this);
        btnInception.setOnClickListener(this);
        btnToyStory.setOnClickListener(this);
    } // end OnCreate()


    @Override
    public void onClick(View buttonView){

        int buttonId = buttonView.getId();
        int imageId;

        switch(buttonId) {
            case R.id.gravity:
                imageId = R.drawable.gravity;
                break;
            case R.id.jumanji:
                imageId = R.drawable.jumanji;
                break;
            case R.id.lionKing:
                imageId = R.drawable.lion_king;
                break;
            case R.id.starWars:
                imageId = R.drawable.star_wars;
                break;
            case R.id.inception:
                imageId = R.drawable.inception;
                break;
            case R.id.toyStory:
                imageId = R.drawable.toy_story;
                break;
            default:
                imageId = 0;
                break;
        } // end switch

        if (imageId != 0)
            movieImageView.setImageDrawable(ContextCompat.getDrawable(this, imageId));

    } // end onCLick()


}
