package com.example.botaotoggler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleResult;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleResult = findViewById(R.id.toggleResult);
        textResult = findViewById(R.id.textResult);


    }

    public void enviar(View view){

        if (toggleResult.isChecked() ){
            textResult.setText("Eu seu Magro !");
        }else {
            textResult.setText("Eu nao sou Magro !");
        }

    }

}