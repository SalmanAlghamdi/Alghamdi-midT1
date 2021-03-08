package com.example.alghamdi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Sound = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button a1to2 = (Button) findViewById(R.id.act1to2);
        final Button a1to3 = (Button) findViewById(R.id.act1to3);
        final ImageView cat = (ImageView) findViewById(R.id.cat);

        a1to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen1toScreen2=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(screen1toScreen2);
                Sound.stop();
            }
        });

        a1to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen1toScreen3=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(screen1toScreen3);
                Sound.stop();
            }
        });


        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sound = MediaPlayer.create(MainActivity.this, R.raw.track1);
                Sound.start();
            }
        }
    }
}