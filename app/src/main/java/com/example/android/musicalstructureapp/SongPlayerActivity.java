package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_player);
        currentlyPlayingDetails();
    }

    public  void currentlyPlayingDetails(){
        Intent songIntent = getIntent();

        TextView song = findViewById(R.id.song_playing);
        String currentlyPlayingSong = songIntent.getStringExtra("Song Name");
        song.setText("Currently Playing the Song:  "+currentlyPlayingSong);

        TextView album = findViewById(R.id.album_playing);
        String currentlyPlayingAlbum = songIntent.getStringExtra("Album");
        album.setText("Currently Playing the song from album: " + currentlyPlayingAlbum);
    }

}
