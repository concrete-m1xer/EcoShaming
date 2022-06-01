package ru.ecoshming.ecoshaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.ecoshming.ecoshaming.SignInActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getActionBar().hide();
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, RoutesActivity.class);
        startActivity(i);
    }
}