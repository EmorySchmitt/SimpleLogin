package com.example.simplelogin;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Landing extends AppCompatActivity {

    TextView hallo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        hallo = (TextView) findViewById(R.id.hello);


    }

}
