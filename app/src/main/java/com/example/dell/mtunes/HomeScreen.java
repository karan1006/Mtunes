package com.example.dell.mtunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void romanceGenre(View view){

        Intent intent = new Intent(this,RomanceGenreHomescreen.class);
        startActivity(intent);
    }

    public void partyGenre(View view){

        Intent intent = new Intent(this,PartyGenre.class);
        startActivity(intent);
    }

    public void roadGenre(View view){

        Intent intent = new Intent(this,RoadGenre.class);
        startActivity(intent);
    }

    public void bhangraGenre(View view){

        Intent intent = new Intent(this,BhangraGenre.class);
        startActivity(intent);
    }
}
