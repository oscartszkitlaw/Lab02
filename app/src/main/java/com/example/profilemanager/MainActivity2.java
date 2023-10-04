package com.example.profilemanager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    ImageView logo1;
    ImageView logo2;
    ImageView logo3;
    ImageView logo4;
    ImageView logo5;
    ImageView logo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        logo1 = findViewById(R.id.logo1);
        logo2 = findViewById(R.id.logo2);
        logo3 = findViewById(R.id.logo3);
        logo4 = findViewById(R.id.logo4);
        logo5 = findViewById(R.id.logo5);
        logo6 = findViewById(R.id.logo6);

        logo1.setOnClickListener(this);
        logo2.setOnClickListener(this);
        logo3.setOnClickListener(this);
        logo4.setOnClickListener(this);
        logo5.setOnClickListener(this);
        logo6.setOnClickListener(this);
    }

    public void SetTeamIcon(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        ImageView selectedImage = (ImageView) view;
        String placeholder = "";
        if (selectedImage.getId() == R.id.logo1) {
            placeholder = "question_mark";
        }
        if (selectedImage.getId() == R.id.logo2) {
            placeholder = "power";
        }
        if (selectedImage.getId() == R.id.logo3) {
            placeholder = "play";
        }
        if (selectedImage.getId() == R.id.logo4) {
            placeholder = "pie";
        }
        if (selectedImage.getId() == R.id.logo5) {
            placeholder = "pdf";
        }
        if (selectedImage.getId() == R.id.logo6) {
            placeholder = "bluetooth";
        }
        intent.putExtra("imageID", placeholder);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.logo1) {
            this.SetTeamIcon(view);
        }
        if (view.getId() == R.id.logo2) {
            this.SetTeamIcon(view);
        }
        if (view.getId() == R.id.logo3) {
            this.SetTeamIcon(view);
        }
        if (view.getId() == R.id.logo4) {
            this.SetTeamIcon(view);
        }
        if (view.getId() == R.id.logo5) {
            this.SetTeamIcon(view);
        }
        if (view.getId() == R.id.logo6) {
            this.SetTeamIcon(view);
        }
    }
}