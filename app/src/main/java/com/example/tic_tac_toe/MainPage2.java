package com.example.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage2 extends AppCompatActivity {
    boolean turn=true;

   int bi11=0; int bi12=0; int bi13=0; int bi21=0; int bi22=0; int bi23=0; int bi31=0; int bi32=0; int bi33=0;
    public void checking (int a,TextView t)
    {
        if (turn)
        {
            ((TextView) t).setText("PLAYER 1");
        }
        if (!turn)
        {
            ((TextView) t).setText("PLAYER 2");
        }
        if((bi11==a&&bi21==a&&bi31==a) || (bi12==a&&bi22==a&&bi32==a) || (bi13==a&&bi23==a&&bi33==a) || (bi11==a&&bi12==a&&bi13==a) || (bi21==a&&bi22==a&&bi23==a) || (bi31==a&&bi32==a&&bi33==a)
                || (bi11==a&&bi22==a&&bi33==a) || (bi13==a&&bi22==a&&bi31==a))
        {
            Toast.makeText(getApplicationContext(),"player "+a+"wins",Toast.LENGTH_SHORT).show();
            if(a==1) {
                Intent vh1 = new Intent(MainPage2.this, Player1wins.class);
                startActivity(vh1);
            }
            if(a==2)
            {

                    Intent vh1 = new Intent(MainPage2.this, Player2wins.class);
                    startActivity(vh1);

            }
        }
        else if (bi11!=0 && bi12!=0 && bi13!=0 && bi21!=0 && bi22!=0 && bi23!=0 && bi31!=0 && bi32!=0 && bi33!=0 )
        {
            Toast.makeText(getApplicationContext(),"DRAW",Toast.LENGTH_SHORT).show();
            Intent vh1 = new Intent(MainPage2.this, Draw.class);
            startActivity(vh1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);
        final Button bu11=findViewById(R.id.b11);
        final Button bu12=findViewById(R.id.b12);
        final Button bu13=findViewById(R.id.b13);
        final Button bu21=findViewById(R.id.b21);
        final Button bu22=findViewById(R.id.b22);
        final Button bu23=findViewById(R.id.b23);
        final Button bu31=findViewById(R.id.b31);
        final Button bu32=findViewById(R.id.b32);
        final Button bu33=findViewById(R.id.b33);
        final TextView sel=findViewById(R.id.selection);
        bu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi11 == 0) {
                    if (turn) {
                        ((Button) bu11).setText("X");
                        turn = !turn;
                        bi11=1;
                        checking(1,sel);
                    }
                    else
                        {
                        ((Button) bu11).setText("O");
                        turn = !turn;
                        bi11=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi12 == 0) {
                    if (turn) {
                        ((Button) bu12).setText("X");
                        turn = !turn;
                        bi12=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu12).setText("O");
                        turn = !turn;
                        bi12=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi13 == 0) {
                    if (turn) {
                        ((Button) bu13).setText("X");
                        turn = !turn;
                        bi13=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu13).setText("O");
                        turn = !turn;
                        bi13=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi21 == 0) {
                    if (turn) {
                        ((Button) bu21).setText("X");
                        turn = !turn;
                        bi21=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu21).setText("O");
                        turn = !turn;
                        bi21=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi22 == 0) {
                    if (turn) {
                        ((Button) bu22).setText("X");
                        turn = !turn;
                        bi22=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu22).setText("O");
                        turn = !turn;
                        bi22=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi23 == 0) {
                    if (turn) {
                        ((Button) bu23).setText("X");
                        turn = !turn;
                        bi23=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu23).setText("O");
                        turn = !turn;
                        bi23=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi31 == 0) {
                    if (turn) {
                        ((Button) bu31).setText("X");
                        turn = !turn;
                        bi31=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu31).setText("O");
                        turn = !turn;
                        bi31=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi32 == 0) {
                    if (turn) {
                        ((Button) bu32).setText("X");
                        turn = !turn;
                        bi32=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu32).setText("O");
                        turn = !turn;
                        bi32=2;
                        checking(2,sel);
                    }
                }
            }
        });
        bu33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bi33 == 0) {
                    if (turn) {
                        ((Button) bu33).setText("X");
                        turn = !turn;
                        bi33=1;
                        checking(1,sel);
                    } else {
                        ((Button) bu33).setText("O");
                        turn = !turn;
                        bi33=2;
                        checking(2,sel);
                    }
                }
            }
        });

    }
}
