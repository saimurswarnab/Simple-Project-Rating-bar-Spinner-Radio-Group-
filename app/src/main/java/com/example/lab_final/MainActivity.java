package com.example.lab_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioButton rbn1,rbn2,rbn3;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbn1 = (RadioButton) findViewById(R.id.rb1);
        rbn2 = (RadioButton) findViewById(R.id.rb2);
        rbn3 = (RadioButton) findViewById(R.id.rb3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Spinner.class);
                startActivity(intent);
            }
        });




}

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), (CharSequence) rbn1, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), (CharSequence) rbn2, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), (CharSequence) rbn3, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}