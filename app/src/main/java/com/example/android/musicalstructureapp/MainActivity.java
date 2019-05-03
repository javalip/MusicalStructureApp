package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView indian = (TextView) findViewById(R.id.indian);
        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indianMusicIntent = new Intent(MainActivity.this, IndianMusicActivity.class);
                startActivity(indianMusicIntent);
            }
        });

        TextView western = (TextView) findViewById(R.id.western);
        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent westernMusicIntent = new Intent(MainActivity.this, WesternMusicActivity.class);
                startActivity(westernMusicIntent);
            }
        });

        TextView regional = (TextView) findViewById(R.id.regional);
        regional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regionalMusicIntent = new Intent(MainActivity.this, RegionalMusicActivity.class);
                startActivity(regionalMusicIntent);
            }
        });


    }


}
