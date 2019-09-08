package com.example.midterm07600532;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        String user = intent.getStringExtra("User");
        String goesto = intent.getStringExtra("goesto");
        String livein = intent.getStringExtra("livein");
        String from = intent.getStringExtra("from");

        TextView username = findViewById(R.id.username_textView);
        TextView Goesto = findViewById(R.id.goestotextView);
        TextView Livein = findViewById(R.id.livetotextView11);
        TextView From = findViewById(R.id.formtextView12);

        username.setText(user);
        Goesto.setText(goesto);
        Livein.setText(livein);
        From.setText(from);

    }
}
