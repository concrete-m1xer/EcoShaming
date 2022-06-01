package ru.ecoshming.ecoshaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Colomenskoe extends AppCompatActivity implements View.OnClickListener {

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

    public ImageButton gorod;
    public ImageButton shore;
    public ImageButton back1;

    void SetMap(){
        setContentView(R.layout.colomenscoe_map);
        this.shore = (ImageButton) findViewById(R.id.back_to_route_descr);
        findViewById(R.id.back_to_route_descr).setOnClickListener(this);
        this.shore = (ImageButton) findViewById(R.id.shore_discr);
        findViewById(R.id.shore_discr).setOnClickListener(this);
        this.gorod = (ImageButton) findViewById(R.id.gorodishe_discr);
        findViewById(R.id.gorodishe_discr).setOnClickListener(this);
        return;
    }

    public void SetImageText(String imageName, String text){
        setContentView(R.layout.colomenskoe_set);
        ImageView img = (ImageView) findViewById(R.id.app_bar_image);
    }

    @Override
    public void onClick(View v){
        int i = v.getId();
        switch (i){
            case (R.id.back_to_route_descr): {

                break;
            }
            case (R.id.shore_discr): {

                break;
            }
            case (R.id.gorodishe_discr): {

                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }
}