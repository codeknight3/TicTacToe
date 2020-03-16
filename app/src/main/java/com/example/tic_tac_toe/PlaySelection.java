package com.example.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaySelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_selection);
        Button player1=findViewById(R.id.play1);
        Button player2=findViewById(R.id.play2);
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sap=new Intent(PlaySelection.this,mainpage.class);
                startActivity(sap);
            }
        });
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pas=new Intent(PlaySelection.this,MainPage2.class);
                startActivity(pas);
            }
        });
    }
}
