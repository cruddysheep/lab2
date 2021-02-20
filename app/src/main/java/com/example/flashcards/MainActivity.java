package com.example.flashcards;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView q1, a1;
        q1= findViewById(R.id.Question1);
        a1= findViewById(R.id.Answer1);

        q1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            // User can tap a button to change the text string of the label - Android is
            public void onClick(View v) {

                q1.setVisibility(View.INVISIBLE);
                a1.setVisibility(View.VISIBLE);

            }
        });
        a1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            // User can tap a button to change the text string of the label - Android is
            public void onClick(View v) {

                a1.setVisibility(View.INVISIBLE);
                q1.setVisibility(View.VISIBLE);

            }
        });
    }
}