package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WesternMusicActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Sealed With the Kiss", "Song by Bobby Vinton"));
        songs.add(new Song("You Dont own me", "Grace"));
        songs.add(new Song("Blue Spanish Eyes", "Engelbert Humperdinck"));
        songs.add(new Song("Summer Wine", "Nancy Sinatra And Lee Hazelwood"));
        songs.add(new Song("What a Beutiful World", "Jo jeeta wohi Sikandar"));
        songs.add(new Song("Fly Me To The Moon", "Frank Sinatra"));
        songs.add(new Song("If I Could Save Time In A Bottle", "Jim Croce"));
        songs.add(new Song("Honey", "Bobby Goldsboro"));
        songs.add(new Song("Final Count Down", "Final Count Down"));
        songs.add(new Song("Avengers", "Avengers"));
        songs.add(new Song("California Draming", "California Draming"));


        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener(this);


    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Song currentlyPlayingSong = (Song) adapterView.getItemAtPosition(position);

        String playingSong = currentlyPlayingSong.getNameOfSong();
        String playingSongAlbum = currentlyPlayingSong.getNameOfalbum();


        Intent currentlyPlayingSongIntent = new Intent(this, SongPlayerActivity.class);
        currentlyPlayingSongIntent.putExtra("Song Name", playingSong);
        currentlyPlayingSongIntent.putExtra("Album", playingSongAlbum);
        startActivity(currentlyPlayingSongIntent);

    }

}
