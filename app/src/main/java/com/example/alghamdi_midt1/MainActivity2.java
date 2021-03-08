package com.example.alghamdi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText Name = (EditText) findViewById(R.id.Name);
        final EditText Birth = (EditText) findViewById(R.id.Date);
        final RadioButton rM = (RadioButton) findViewById(R.id.rM);
        final RadioButton rf = (RadioButton) findViewById(R.id.rF);
        final RadioButton rS = (RadioButton) findViewById(R.id.rstudent);
        final RadioButton rI = (RadioButton) findViewById(R.id.rinstructor);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioGroup rG2 = (RadioGroup) findViewById(R.id.radioGroup2);
        final TextView message = (TextView) findViewById(R.id.MSG);
        final Button a2to1 = (Button) findViewById(R.id.act2to1);
        final Button a2to3 = (Button) findViewById(R.id.act2to3);
        final Button Done = (Button) findViewById(R.id.done);


        a2to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen2ToScreen1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(screen2ToScreen1);
            }
        });

        a2to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen2ToScreen3 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(screen2ToScreen3);


            }
        });


        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Name!=null && Birth!=null){
                    if (rM.isChecked()){
                        message.setText("HELLO Mr " + Name.getText()+" you are " + (2021-Integer.parseInt(Birth.getText().toString())) + " years old");
                    }

                    if (rf.isChecked()){
                        message.setText("HELLO Miss " + Name.getText()+" you are " + (2021-Integer.parseInt(Birth.getText().toString())) + " years old");
                    }

                    else {
                        Toast.makeText(MainActivity2.this,"Please enter all info", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    }
}