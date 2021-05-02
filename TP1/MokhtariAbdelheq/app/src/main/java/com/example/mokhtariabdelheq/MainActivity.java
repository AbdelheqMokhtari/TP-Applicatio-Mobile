package com.example.mokhtariabdelheq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickButton(View view){
        TextView helloMssg = findViewById(R.id.helloMsg);
        EditText textMssg = findViewById(R.id.personName);
        helloMssg.setText("Welecom Back "+ textMssg.getText().toString());


    }
}