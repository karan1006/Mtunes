package com.example.dell.mtunes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RoadGenre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<Custom> list = new ArrayList<Custom>();

        list.add(new Custom("ROAD SONG 1", "ARTIST 1", R.mipmap.music));
        list.add(new Custom("ROAD SONG 2", "ARTIST 2", R.mipmap.music));
        list.add(new Custom("ROAD SONG 3", "ARTIST 3", R.mipmap.music));
        list.add(new Custom("ROAD SONG 4", "ARTIST 4", R.mipmap.music));
        list.add(new Custom("ROAD SONG 5", "ARTIST 5", R.mipmap.music));
        list.add(new Custom("ROAD SONG 6", "ARTIST 6", R.mipmap.music));
        list.add(new Custom("ROAD SONG 7", "ARTIST 7", R.mipmap.music));
        list.add(new Custom("ROAD SONG 8", "ARTIST 8", R.mipmap.music));
        list.add(new Custom("ROAD SONG 9", "ARTIST 9", R.mipmap.music));
        list.add(new Custom("ROAD SONG 10", "ARTIST 10", R.mipmap.music));

        CustomAdapter adapter = new CustomAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.musicList);
        listView.setAdapter(adapter);

    }

}
