package com.example.lab_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Bar extends AppCompatActivity {
    RatingBar ratingbar;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        textView = findViewById(R.id.txt1);
        addListenerOnButtonClick();
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("key"));

    }

    private void addListenerOnButtonClick() {

        ratingbar=(RatingBar)findViewById(R.id.ratingBar);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating=String.valueOf(ratingbar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}