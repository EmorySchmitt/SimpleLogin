package com.example.simplelogin;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button enter,cancel;
    EditText user,pass;

    TextView username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = (Button)findViewById(R.id.login_button);
        user = (EditText)findViewById(R.id.userName);
        pass = (EditText)findViewById(R.id.passWord);

        cancel = (Button)findViewById(R.id.cancel_button);
        username = (TextView)findViewById(R.id.userName);
        password = (TextView)findViewById(R.id.passWord);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!user.getText().toString().equals("Link")){
                    Toast.makeText(getApplicationContext(),
                            "Incorrect username", Toast.LENGTH_SHORT).show();

                    username.setVisibility(View.VISIBLE);
                    username.setBackgroundColor(Color.RED);

                } else {
                    username.setVisibility(View.VISIBLE);
                    username.setBackgroundColor(Color.WHITE);

                }

                if (!password.getText().toString().equals("Zelda")) {
                    Toast.makeText(getApplicationContext(),
                            "incorrect password", Toast.LENGTH_SHORT).show();

                    password.setVisibility(View.VISIBLE);
                    password.setBackgroundColor(Color.RED);
                } else {
                    password.setVisibility(View.VISIBLE);
                    password.setBackgroundColor(Color.WHITE);
                }

                if (user.getText().toString().equals("Link") &&
                        pass.getText().toString().equals("Zelda")) {
                    Intent intent = new Intent(MainActivity.this, Landing.class);
                    startActivity(intent);
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
