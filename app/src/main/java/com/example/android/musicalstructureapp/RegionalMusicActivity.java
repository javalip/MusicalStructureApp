package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RegionalMusicActivity  extends AppCompatActivity implements  ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Tum Nam Eee Mana Midiyutide", "Eradu Kanasu"));
        songs.add(new Song("Elliruve Manava Kaduva Roopasiye", "Bayalu Dari"));
        songs.add(new Song("Ba Ba Ro Baro Ranadheera", "Ranadheera"));
        songs.add(new Song("Chaluve Ondu Heltini", "Prema Loka"));
        songs.add(new Song("Onde Ondu Aseyu", "Shankar Nag"));
        songs.add(new Song("Neera Bittu Nelada Mele", "Vishnu"));
        songs.add(new Song("Kanasalu Neene Manasalu Neene", "Bayalu Dari"));
        songs.add(new Song("Nijava Nudiyale Nannane Chaluve", "unkown"));
        songs.add(new Song("Yare Koogadali", "Dr Raj"));
        songs.add(new Song("Noorondu Nenapu", "Vishnu"));
        songs.add(new Song("Banna", "Unkown"));
        songs.add(new Song("Chali Chali Talenu", "Chakravyuha"));

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
