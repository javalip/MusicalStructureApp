package com.example.android.musicalstructureapp;

public class Song {

    // The name of song.
    private String mNameOfSong;

    // The name of album
    private String mNameOfalbum;


    /***
     *
     * @param nameOfSong - name of song
     * @param nameOfalbum - name of album
     */
    public Song (String nameOfSong, String nameOfalbum) {
        mNameOfSong = nameOfSong;
        mNameOfalbum = nameOfalbum;

    }

    //get name of the song
    public String getNameOfSong() {
        return mNameOfSong;
    }

    //get name of the album
    public String getNameOfalbum() {
        return mNameOfalbum;
    }
}
