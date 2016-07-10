package com.example.dell.mtunes;


import java.io.Serializable;

public class Custom implements Serializable{

    private String mSongName;
    private String mSongArtist;
    private int mResourceId;

    public Custom(String songName, String songArtist, int resourceId){

        mSongName= songName;
        mSongArtist=songArtist;
        mResourceId=resourceId;


    }

    public String getSongName(){

        return mSongName;
    }

    public String getSongArtist(){

        return mSongArtist;
    }

    public int getResourceId(){

        return mResourceId;
    }

}
