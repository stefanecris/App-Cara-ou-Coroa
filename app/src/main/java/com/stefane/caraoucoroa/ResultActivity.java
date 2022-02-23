package com.stefane.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageResult;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResult = findViewById(R.id.imageResult);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        Bundle result = getIntent().getExtras();

        if(result.getInt("resultadoSorteio") == 0){
            imageResult.setImageResource(R.drawable.moeda_cara);
        }else{
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }
}
