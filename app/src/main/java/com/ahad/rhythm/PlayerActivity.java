package com.ahad.rhythm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    Button btn_next,btn_pause,btn_previous;
    TextView songTextLabel;
    SeekBar songSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        btn_next = (Button)findViewById(R.id.next);
        btn_pause = (Button)findViewById(R.id.pause);
        btn_previous = (Button)findViewById(R.id.previous);

        songTextLabel = (TextView)findViewById(R.id.songLabel);
        songSeekBar = (SeekBar)findViewById(R.id.seek_bar);
    }
}
