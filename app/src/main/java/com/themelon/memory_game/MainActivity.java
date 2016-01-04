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
    }

}
