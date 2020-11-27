package com.acadetorress.e_grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

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
                mediaPlayer.start();
            }
        });

    }
}