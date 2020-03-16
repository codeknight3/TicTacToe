package com.example.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LastPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        Button finalbut=findViewById(R.id.btback);
        finalbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ffintent= new Intent(LastPage.this,FirstPage.class);
                startActivity(ffintent);
            }
        });
    }
}
