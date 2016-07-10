package com.example.dell.mtunes;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RomanticWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);


        ArrayList<Custom1> list = new ArrayList<Custom1>();


        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            Custom custom= (Custom) extras.getSerializable("SONG 1");
            list.add(new Custom1(R.mipmap.aashiqui2));

        }

        CustomAdapter1 adapter1 = new CustomAdapter1(this,list);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(adapter1);


        }

    public void play(View view){

        Toast.makeText(this,"BUTTON TAPPED",Toast.LENGTH_SHORT).show();
    }

    }
