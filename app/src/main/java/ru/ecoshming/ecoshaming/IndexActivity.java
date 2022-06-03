package ru.ecoshming.ecoshaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.jar.Attributes;

public class IndexActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton imgbtn1 = (ImageButton) findViewById(R.id.imageButton);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Button routes = (Button) findViewById(R.id.routes);
        routes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(IndexActivity.this, RoutesActivity.class));
            }
        });

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(IndexActivity.this, ProfileActivity.class));
            }
        });

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(IndexActivity.this, ContactsActivity.class));
            }
        });

        ImageButton imgbtn5 = (ImageButton) findViewById(R.id.imageButton5);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(IndexActivity.this, ProfileActivity.class));
            }

        });

        /*TextView tv8 = (TextView)findViewById(R.id.textView8);


        FirebaseUser u = FirebaseAuth.getInstance().getCurrentUser();

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        tv8.setText(db.collection("users").whereEqualTo("email", u.getEmail()).get().getResult().toString());
        //чекнуть вывод*/

    }
}
