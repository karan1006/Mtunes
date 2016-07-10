package com.example.dell.mtunes;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Custom>{


    public CustomAdapter(Activity context, ArrayList<Custom> customs) {

        super(context,0,customs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null){

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Custom current = getItem(position);

        TextView songNameTextView =(TextView) listItemView.findViewById(R.id.songName);
        songNameTextView.setText(current.getSongName());

        TextView artistNameTextView =(TextView) listItemView.findViewById(R.id.songArtist);
        artistNameTextView.setText(current.getSongArtist());

        ImageView songImageView= (ImageView) listItemView.findViewById(R.id.image);
        songImageView.setImageResource(current.getResourceId());

        return listItemView;
    }
}
