package com.ahad.rhythm;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity {

    Button btn_next,btn_pause,btn_previous;
    TextView songTextLabel;
    SeekBar songSeekBar;

    static MediaPlayer myMediaPlayer;
    int position;
    ArrayList<File> mySongs;
    Thread updateSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        btn_next = (Button)findViewById(R.id.next);
        btn_pause = (Button)findViewById(R.id.pause);
        btn_previous = (Button)findViewById(R.id.previous);
        songTextLabel = (TextView)findViewById(R.id.songLabel);
        songSeekBar = (SeekBar)findViewById(R.id.seek_bar);

        updateSeekBar = new Thread(){
            @Override
            public void run() {
                int total_duration = myMediaPlayer.getDuration();
                int currentPosition = 0;
            }
        };
    }
}
