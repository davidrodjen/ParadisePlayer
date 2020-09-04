package com.example.paradiseplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class doveDive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dove_dive);

        final MediaPlayer summerstrings = MediaPlayer.create(this, R.raw.summerstrings);

        Button playSound = (Button) this.findViewById(R.id.summerPlayBtn);
        Button stopSound = (Button) this.findViewById(R.id.summerStpBtn);

        playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summerstrings.start();
            }
        });

        stopSound.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summerstrings.pause();
            }
        }));

    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}