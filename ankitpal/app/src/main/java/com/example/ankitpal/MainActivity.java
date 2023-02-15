package com.example.ankitpal;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the VideoView by its id
        videoView = findViewById(R.id.videoView);

        //Set the video path
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.a;
        Uri videoUri = Uri.parse(videoPath);

        //Set the video URI to the VideoView
        videoView.setVideoURI(videoUri);

        //Set the video to loop
        videoView.setOnPreparedListener(mp -> mp.setLooping(true));

        //Start the video
        videoView.start();

        if (!videoView.isPlaying()) {
            videoView.start();
        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!videoView.isPlaying()) {
            videoView.start();
        }
    }
}