package com.example.mokhtariabdelheeq;

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
    public void onClickButton(View view){
        EditText username = findViewById(R.id.user_input);
        TextView Text = findViewById(R.id.msg);
        Text.setText("Welecom back  "+ username.getText().toString());

    }
}
