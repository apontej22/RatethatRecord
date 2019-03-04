package com.example.ratethatrecord;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    MediaPlayer mpMoenia, mpMiranda, mpEnrique;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btnMoenia);
        button2 = (Button) findViewById(R.id.btnMiranda);
        button3 = (Button) findViewById(R.id.btnEnrique);
        button1.setOnClickListener(bMoenia);
        button2.setOnClickListener(bMiranda);
        button3.setOnClickListener(bEnrique);
        mpMoenia = new MediaPlayer();
        mpMoenia = MediaPlayer.create(this, R.raw.MoeniaEstabasAhi);
        mpMiranda = new MediaPlayer();
        mpMiranda = MediaPlayer.create(this, R.raw.MirandaMentia);
        mpEnrique = new MediaPlayer();
        mpEnrique = MediaPlayer.create(this, R.raw.Enrique);
        playing = 0;

    }
    Button.OnClickListener bMoenia = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpMoenia.start();
                    playing = 1;
                    button1.setText("Pause Moenia Song");
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpMoenia.pause();
                    playing = 0;
                    button1.setText("Play Moenia Song");
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    break;
            }

        }
    };

    Button.OnClickListener bMiranda = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpMiranda.start();
                    playing = 1;
                    button2.setText("Pause Miranda Song");
                    button1.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpMiranda.pause();
                    playing = 0;
                    button2.setText("Play Miranda Song");
                    button1.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);

                    break;
            }

        }
    };

    Button.OnClickListener bEnrique = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpEnrique.start();
                    playing = 1;
                    button3.setText("Pause Enrique Song");
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpEnrique.pause();
                    playing = 0;
                    button3.setText("Play Enrique Song");
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    break;
            }

        }
    };
}
