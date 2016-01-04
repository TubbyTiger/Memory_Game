package com.themelon.memory_game;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer redBeep = MediaPlayer.create(this, R.raw.beep1);
        ImageButton RedButton = (ImageButton)this.findViewById(R.id.RedButton);
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redBeep.start();

            }
        });


        final MediaPlayer purpleBeep = MediaPlayer.create(this, R.raw.beep2);
        ImageButton PurpleButton = (ImageButton)this.findViewById(R.id.PurpleButton);
        PurpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpleBeep.start();
            }
        });


        final MediaPlayer blueBeep = MediaPlayer.create(this, R.raw.beep3);
        ImageButton BlueButton = (ImageButton)this.findViewById(R.id.BlueButton);
        BlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueBeep.start();
            }
        });


        final MediaPlayer greenBeep = MediaPlayer.create(this, R.raw.beep4);
        ImageButton GreenButton = (ImageButton)this.findViewById(R.id.GreenButton);
        GreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenBeep.start();
            }
        });



        final MediaPlayer orangeBeep = MediaPlayer.create(this, R.raw.beep5);
        ImageButton OrangeButton = (ImageButton)this.findViewById(R.id.OrangeButton);
        OrangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orangeBeep.start();
            }
        });



        final MediaPlayer yellowBeep = MediaPlayer.create(this, R.raw.beep6);
        ImageButton YellowButton = (ImageButton)this.findViewById(R.id.YellowButton);
        YellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yellowBeep.start();
            }
        });



        final MediaPlayer brownBeep = MediaPlayer.create(this, R.raw.beep7);
        ImageButton BrownButton = (ImageButton)this.findViewById(R.id.BrownButton);
        BrownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brownBeep.start();
            }
        });


        final MediaPlayer pinkBeep = MediaPlayer.create(this, R.raw.beep8);
        ImageButton PinkButton = (ImageButton)this.findViewById(R.id.PinkButton);
        PinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pinkBeep.start();
            }
        });



        final MediaPlayer tealBeep = MediaPlayer.create(this, R.raw.beep9);
        ImageButton TealButton = (ImageButton)this.findViewById(R.id.TealButton);
        TealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tealBeep.start();
            }
        });
    }

}
