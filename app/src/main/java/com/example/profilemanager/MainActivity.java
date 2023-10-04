package com.example.profilemanager;

import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button openInGoogleMaps;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openInGoogleMaps = findViewById(R.id.openGoogleMaps);
        avatar = findViewById(R.id.avatar);

        openInGoogleMaps.setOnClickListener(this);
        avatar.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String avatarID = extras.getString("imageID");
            int resID = getResources().getIdentifier(avatarID, "drawable", getPackageName());
            avatar.setImageResource(resID);
        }
    }

    public void OnOpenInGoogleMaps (View view) {
        EditText teamAddress = (EditText) findViewById(R.id.teamAddressField);
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAddress.getText());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void OnSetAvatarButton(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.openGoogleMaps) {
            this.OnOpenInGoogleMaps(view);
        }
        if (view.getId() == R.id.avatar) {
            this.OnSetAvatarButton(view);
        }
    }
}