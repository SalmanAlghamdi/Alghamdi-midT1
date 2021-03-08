package com.example.alghamdi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        final Button a3to1 = (Button) findViewById(R.id.act3to1);
        final Button a3to2 = (Button) findViewById(R.id.act3to2);

        a3to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen2ToScreen1 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(screen2ToScreen1);
            }
        });

        a3to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen2ToScreen3 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(screen2ToScreen3);
            }
        });


        String[] attraction = {
                "First Item",
                "Second Item",
                "Third Item",
                "Fourth Item",
                "Fifth Item",
                "GO TO ACT 1",
                "GO TO ACT 2"};

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main3,R.id.travel,attraction));

    }

    protected void onListItemClick(
            ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

        switch(position) {
            case 0:
                startActivity(new Intent(MainActivity3.this, BigImage.class));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://amazon.com")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://apple.com")));
                break;

            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;

            case 5:
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
                break;

            case 6:
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
                break;
        }

    }

}