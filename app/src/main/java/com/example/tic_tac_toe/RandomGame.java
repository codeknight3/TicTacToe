package com.example.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class RandomGame extends AppCompatActivity {

    int randomgen()
    {
        Random rand= new Random();
        int no= rand.nextInt(9);
        return no;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_game);
    }
}
