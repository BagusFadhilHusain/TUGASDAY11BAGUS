package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class AlatActivity extends AppCompatActivity {

    ImageButton homeButton, descriptionButton, widgetsButton, personButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Menginisialisasi tombol
        homeButton = findViewById(R.id.homeButton);
        descriptionButton = findViewById(R.id.descriptionButton);
        widgetsButton = findViewById(R.id.widgetsButton);
        personButton = findViewById(R.id.personButton);

        // Mengatur OnClickListener untuk setiap tombol
        klik();
    }

    void klik(){
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        descriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatActivity.this, FileActivity.class);
                startActivity(intent);
            }
        });

        widgetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatActivity.this, AlatActivity.class);
                startActivity(intent);
            }
        });

        personButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlatActivity.this, SayaActivity.class);
                startActivity(intent);
            }
        });
    }
}