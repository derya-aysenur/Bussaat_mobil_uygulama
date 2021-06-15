package com.example.bussaat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bilet_tipi;
    ImageView durak;
    ImageView kart;
    ImageView yolcu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity activity = this;

        bilet_tipi = (ImageView) findViewById(R.id.bukart_bilet_tipi);
        durak = (ImageView)findViewById(R.id.duraksaatleri);
        kart = (ImageView)findViewById(R.id.kartbasvuru);
        yolcu = (ImageView) findViewById(R.id.yolculukkurallari);


        bilet_tipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hat= new Intent(getApplicationContext(), bukart_bilet_tipi.class);
                startActivity(hat);

            }
        });
        durak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent durak = new Intent(getApplicationContext(),duraksaatleri.class);
                startActivity(durak);
                activity.finish();
            }
        });
        kart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kart = new Intent(getApplicationContext(),kartbasvuru.class);
                startActivity(kart);
                activity.finish();
            }
        });
        yolcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yolcu = new Intent(getApplicationContext(),yolcukurallari.class);
                startActivity(yolcu);
                activity.finish();
            }
        });

    }
}