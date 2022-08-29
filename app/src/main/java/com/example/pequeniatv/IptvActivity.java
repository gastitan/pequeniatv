package com.example.pequeniatv;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class IptvActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iptv);

        VideoView videoView = this.findViewById(R.id.video);
        videoView.setMediaController(null);

        videoView.requestFocus();

        videoView.setVideoURI(Uri.parse(getIntent().getStringExtra("channel")));

        videoView.setOnPreparedListener(mediaPlayer -> videoView.start());
    }
}
