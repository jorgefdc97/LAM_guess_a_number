package com.example.lam_guess_a_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public TextView attemptsTextView;
    public static String RESULT_STRING = "";
    private int random;
    private int attempts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        random = r.nextInt(9) + 1;
        attempts = 0;
        attemptsTextView = findViewById(R.id.attemptsTextView);
        attemptsTextView.setText(R.string.attempts); // passar argumento de n tentativas
    }

    public void onClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);

        TextInputEditText inputText = findViewById(R.id.textInputEditText);
        String str = inputText.getText().toString();

        while (attempts < 3 && random == Integer.parseInt(str)){
            attempts++;
        }
        if (attempts < 3){
            RESULT_STRING = getString(R.string.success);
        }else{
            RESULT_STRING = getString(R.string.fail);
        }

        startActivity(intent);
    }


}