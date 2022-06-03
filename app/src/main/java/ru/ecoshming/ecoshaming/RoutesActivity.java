package ru.ecoshming.ecoshaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class RoutesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        ImageButton back = (ImageButton) findViewById(R.id.imageButton4);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Button route1 = (Button) findViewById(R.id.route_col);
        route1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RoutesActivity.this, Colomenskoe.class));
            }
        });
    }
}