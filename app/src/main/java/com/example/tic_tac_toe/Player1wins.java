package com.example.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player1wins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1wins);
        Button sta=findViewById(R.id.but);
        sta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent V=new Intent(Player1wins.this,FirstPage.class);
                startActivity(V);
            }
        });
    }
}
