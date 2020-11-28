package com.acadetorress.e_grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    public void showProduct (View v) {
        Intent intent = new Intent(MainActivity.this, showProductView.class);
        intent.putExtra("Image", R.drawable.item1);
        intent.putExtra("itemName", "Super Grocery");
        intent.putExtra("itemPromo", "CONTAINS ALL THE RELIEF PACKS FROM ALL THE PREVIOUS TYPHOONS, BUY AT YOUR OWN RISK.");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView banner = findViewById(R.id.banner);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;
        Uri videoUri = Uri.parse(videoPath);
        banner.setVideoURI(videoUri);
        banner.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setVolume(0f,0f);
                mediaPlayer.setLooping(true);
                mediaPlayer.seekTo(5000);
                mediaPlayer.start();
                mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                    @Override
                    public void onSeekComplete(MediaPlayer mediaPlayer) {
                        mediaPlayer.start();
                    }
                });
            }
        });
    }
}