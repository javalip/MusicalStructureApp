package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class IndianMusicActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Senorita", "Zindagi Na Milegi Dobara"));
        songs.add(new Song("Khwabo ki Parinde", "Zindagi Na Milegi Dobara"));
        songs.add(new Song("Der Lagi Lekin", "Zindagi Na Milegi Dobara"));
        songs.add(new Song("Pehla Nasha", "Jo jeeta wohi Sikandar"));
        songs.add(new Song("Shehar Ki Parion", "Jo jeeta wohi Sikandar"));
        songs.add(new Song("Rooth ke hum se", "Jo jeeta wohi Sikandar"));
        songs.add(new Song("Yahan ke hum sikander", "Jo jeeta wohi Sikandar"));
        songs.add(new Song("Kyun Chalti Hai Pavan", "Kaho na pyar hai"));
        songs.add(new Song("Ek Pal Ka Jeena", "Kaho na pyar hai"));
        songs.add(new Song("Neele Neele Amber", "Kalakar"));
        songs.add(new Song("Do Labzon Ki Hai Dil Ki Kahani", "The Great Gambler"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Song currentlyPlayingSong = (Song) adapterView.getItemAtPosition(position);

        String  playingSong = currentlyPlayingSong.getNameOfSong();
        String  playingSongAlbum = currentlyPlayingSong.getNameOfalbum();


        Intent currentlyPlayingSongIntent = new Intent(this, SongPlayerActivity.class);
        currentlyPlayingSongIntent.putExtra("Song Name", playingSong);
        currentlyPlayingSongIntent.putExtra("Album", playingSongAlbum);
        startActivity(currentlyPlayingSongIntent);

    }

}
