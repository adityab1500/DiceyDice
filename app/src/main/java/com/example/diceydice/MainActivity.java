package com.example.diceydice;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySong=MediaPlayer.create(MainActivity.this,R.raw.song);


        Button rollButton;
        rollButton= (Button)findViewById(R.id.button_roll);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_left);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_right);

        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,

        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","The button has been pressed");

                Random randomNumbergenerator = new Random();

                int number=randomNumbergenerator.nextInt(6);

                Log.d("Dicee", "The random number is: "+number);

                leftDice.setImageResource(diceArray[number]);

                number=randomNumbergenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);


            }
        });



    }
    public void playIT(View v){
        mySong.start();

    }
}
