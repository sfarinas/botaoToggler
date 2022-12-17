package com.example.botaotoggler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleResult;
    private TextView textResult;
    private ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleResult = findViewById(R.id.toggleResult);
        textResult = findViewById(R.id.textResult);
        progressBar2 = findViewById(R.id.progressBar2);

    }
    public void enviar(View view){

        if (toggleResult.isChecked() ){
            textResult.setText("Eu sou Magro !");
            progressBar2.setVisibility(View.VISIBLE);

        }else {
            textResult.setText("Eu nao sou Magro !");
            progressBar2.setVisibility(View.INVISIBLE);

        }

    }

}