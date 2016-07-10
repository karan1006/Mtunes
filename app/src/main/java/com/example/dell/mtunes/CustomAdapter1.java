package com.example.dell.mtunes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


import java.util.ArrayList;


public class CustomAdapter1 extends ArrayAdapter<Custom1> {

    public CustomAdapter1(Activity context, ArrayList<Custom1> customs) {

        super(context,0,customs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null){

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item1,parent,false);
        }

        Custom1 current = getItem(position);


        ImageView songImageView= (ImageView) listItemView.findViewById(R.id.songAlbumArt);
        songImageView.setImageResource(current.getResourceId());

        return listItemView;
    }
}


