package ru.ecoshming.ecoshaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Colomenskoe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colomenskoe);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton back = (ImageButton) findViewById(R.id.imageButton5);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Button tomap = (Button) findViewById(R.id.tomap);
        tomap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Colomenskoe.this, null));
            }
        });
    }
}