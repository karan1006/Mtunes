package com.example.dell.mtunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanceGenreHomescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        final ArrayList<Custom> list = new ArrayList<Custom>();

        list.add(new Custom("TUM HI HO","FLUTE INSTRUMENTAL", R.mipmap.aashiqui2));
        list.add(new Custom("ROMANTIC SONG 2","ARTIST 2",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 3","ARTIST 3",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 4","ARTIST 4",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 5","ARTIST 5",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 6","ARTIST 6",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 7","ARTIST 7",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 8","ARTIST 8",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 9","ARTIST 9",R.mipmap.music));
        list.add(new Custom("ROMANTIC SONG 10","ARTIST 10",R.mipmap.music));

       final CustomAdapter adapter= new CustomAdapter(this,list);

        final ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               if(position==0) {

                   Intent intent = new Intent(RomanceGenreHomescreen.this, RomanticWindow.class);
                   intent.putExtra("SONG 1",new Custom("ROMANTIC SONG 1","ARTIST 1",R.mipmap.aashiqui2));
                   startActivity(intent);
               }

                if(position==1) {

                    Intent intent = new Intent(RomanceGenreHomescreen.this, RomanticWindow.class);
                    intent.putExtra("SONG 2",new Custom("ROMANTIC SONG 2","ARTIST 2",R.mipmap.music));
                    startActivity(intent);
                }

            }
        });

    }



}
