package com.example.lab_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class Spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn3;
    String[] team = {"Brazil","Argentina","Portugal"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Spinner.this,Bar.class);
                startActivity(intent);
            }
        });
        android.widget.Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_spinner_item,team);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(ad);


    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),team[i] , Toast.LENGTH_LONG).show();
        Intent intent = getIntent();
        // String b = intent.getStringExtra("Key");
        btn3.setText(intent.getStringExtra("Key"));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}