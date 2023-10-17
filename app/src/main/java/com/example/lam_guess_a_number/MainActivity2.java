package com.example.lam_guess_a_number;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        textView = findViewById(R.id.textView2);
        textView.setText(MainActivity.RESULT_STRING);
    }
}
