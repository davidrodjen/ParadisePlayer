package com.example.paradiseplayer;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToArtist = (Button) this.findViewById(R.id.goToArtist);
        Button goToDove = (Button) this.findViewById(R.id.goToArtistDove);


        goToArtist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openArtist();
            }
        });

        goToDove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDove();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout mainLayout =
                findViewById(R.id.layoutView);
        switch (item.getItemId()) {
            case R.id.menu_Default:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundResource(R.drawable.background);
                return true;
            case R.id.menu_cottonCandy:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundResource(R.drawable.cottoncandy);
                return true;
            case R.id.menu_deepVibe:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundResource(R.drawable.deepvibe);
                return true;
            case R.id.menu_starlight:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                mainLayout.setBackgroundResource(R.drawable.starlight);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //https://developer.android.com/training/transitions
    public void openArtist() {
        Intent intent = new Intent(MainActivity.this, seeArtist.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void openDove() {
        Intent intent = new Intent(MainActivity.this, doveDive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
