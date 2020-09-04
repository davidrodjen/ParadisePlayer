package com.example.paradiseplayer;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class seeArtist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_artist);

        final MediaPlayer newMusic = MediaPlayer.create(this, R.raw.music);
        final MediaPlayer dancingfire = MediaPlayer.create(this, R.raw.dancefire);

        Button playSound = (Button) this.findViewById(R.id.selectSong);
        Button stopSound = (Button) this.findViewById(R.id.stp_btn_splash);
        Button playDanceFire = (Button) this.findViewById(R.id.danceFirePlyBtn);
        Button stopDanceFire = (Button) this.findViewById(R.id.danceFireStpBtn);

        playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newMusic.start();
            }
        });

        stopSound.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newMusic.pause();
            }
        }));

        playDanceFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dancingfire.start();
            }
        });

        stopDanceFire.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dancingfire.pause();
            }
        }));
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


}