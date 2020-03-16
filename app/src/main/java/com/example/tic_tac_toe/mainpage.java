package com.example.tic_tac_toe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class mainpage extends AppCompatActivity {
    int bl11 = 2;
    int bl12 = 0;
    int bl13=0;
    int bl21=0;
    int bl22=0;
    int bl23=0;
    int bl31=0;
    int bl32=0;
    int bl33=0;
    int step=1;

    void checkings (Button b11,Button b12,Button b13,Button b21,Button b22,Button b23,Button b31,Button b32,Button b33)
    {
        if(bl11==0) {
            ((Button) b11).setText("O");
            bl11=2;
        }
               if(step==1)

               {
                   if(bl22==1)
                   {
                       ((Button ) b33).setText("O");
                       bl33=2;
                       step++;
                   }
                   if(bl12==1||bl13==1)
                   {
                       ((Button ) b31).setText("O");
                       bl31=2;
                       step++;
                   }
                   if (bl21==1||bl23==1||bl31==1||bl33==1)
                   {
                       ((Button ) b13).setText("O");
                       bl13=2;
                       step++;
                   }
                   if (bl32==1)
                   {
                       ((Button ) b31).setText("O");
                       bl31=2;
                       step++;
                   }
               }
               if (step==3)
               {
                   if(bl22==1 && bl33==2)
                   {
                       if (bl13==1)
                       {
                           ((Button ) b31).setText("O");
                           bl31=2;
                           step++;
                       }
                       if (bl31==1)
                       {
                           ((Button ) b13).setText("O");
                           bl13=2;
                           step++;
                       }
                      /* if (bl12==1 && step==3)
                       {
                           ((Button ) b32).setText("O");
                           bl32=2;
                           step++;

                       }
                       if (bl21==1 && step==3)
                       {
                           ((Button ) b23).setText("O");
                           bl23=2;
                           step++;

                       }
                       if (bl23==1 && step==3)
                       {
                           ((Button ) b21).setText("O");
                           bl21=2;
                           step++;

                       }
                       if (bl32==1 && step==3)
                       {
                           ((Button ) b12).setText("O");
                           bl12=2;
                           step++;

                       } */

                       if (bl13!=1 && bl31!=1 && step==3 )
                       {
                           Intent abd= new Intent(mainpage.this,Draw.class);
                           startActivity(abd);
                           Toast.makeText(getApplicationContext(),"YOU ARE GENIUS,I CAN'T WIN NOW",Toast.LENGTH_LONG).show();
                       }

                   }
                   if((bl12==1||bl13==1) && bl31==2 &&step==3 )
                   {
                       if (bl21==0)
                       {
                           ((Button ) b21).setText("O");
                           bl21=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);
                       }
                       if (bl21==1 && bl12==1)
                       {
                           ((Button ) b22).setText("O");
                           bl22=2;
                           step++;
                       }
                       if (bl21==1 && bl13==1)
                       {
                           ((Button ) b33).setText("O");
                           bl33=2;
                           step++;

                       }
                   }
                   if ((bl21==1||bl23==1||bl31==1||bl33==1) && bl13==2 &&step==3)
                   {
                       if (bl12==0)
                       {
                           ((Button ) b12).setText("O");
                           bl12=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);

                       }
                       else
                       {
                           if (bl21==1 || bl23==1)
                           {
                               ((Button ) b22).setText("O");
                               bl22=2;
                               step++;
                           }
                           if (bl31==1)
                           {
                               ((Button ) b33).setText("O");
                               bl33=2;
                               step++;
                           }
                           if (bl33==1)
                           {
                               ((Button ) b31).setText("O");
                               bl31=2;
                               step++;
                           }
                       }
                   }
                   if (bl32==1&&bl31==2 &&step==3)
                   {
                       if (bl21==0)
                       {
                           ((Button ) b21).setText("O");
                           bl21=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);

                       }
                       else
                       {
                           ((Button ) b22).setText("O");
                           bl22=2;
                           step++;

                       }
                   }


               }
               if (step==5)
               {
                   if(bl22==1 && bl33==2 && bl13==1 && bl31==2)
                   {
                       if (bl21==1)
                       {
                           ((Button ) b32).setText("O");
                           bl32=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);

                       }
                       else
                       {
                           ((Button ) b21).setText("O");
                           bl21=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);
                       }
                   }
                   if(bl22==1 && bl33==2 && bl31==1 && bl13==2)
                   {
                       if (bl12==1)
                       {
                           ((Button ) b23).setText("O");
                           bl23=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);

                       }
                       else
                       {
                           ((Button ) b12).setText("O");
                           bl12=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);
                       }
                   }
                   if((bl12==1||bl13==1) && bl31==2 && bl21==1 && (bl22==2 || bl33==2) && step==5 )
                   {
                       if (bl22==2)
                       {
                           if (bl33==1)
                           {
                               ((Button ) b13).setText("O");
                               bl13=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                           else
                           {
                               ((Button ) b33).setText("O");
                               bl33=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                       }
                       if (bl33==2)
                       {
                           if (bl22==1)
                           {
                               ((Button ) b32).setText("O");
                               bl32=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                           else
                           {
                               ((Button ) b22).setText("O");
                               bl22=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                       }
                   }
                   if ((bl21==1||bl23==1||bl31==1||bl33==1) && bl13==2 &&step==5 && (bl22==2 || bl31==2 || bl33==2))
                   {
                       if (bl22==2)
                       {
                           if (bl33==1)
                           {
                               ((Button ) b31).setText("O");
                               bl31=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                           else
                           {
                               ((Button ) b33).setText("O");
                               bl33=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }

                       }
                       if (bl31==2)
                       {
                           if (bl22==1)
                           {
                               ((Button ) b21).setText("O");
                               bl23=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                           else
                           {
                               ((Button ) b22).setText("O");
                               bl22=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                       }
                       if (bl33==2)
                       {
                           if (bl22==1)
                           {
                               ((Button ) b23).setText("O");
                               bl32=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                           else
                           {
                               ((Button ) b22).setText("O");
                               bl22=2;
                               step++;
                               Intent fff=new Intent(mainpage.this,LastPage.class);
                               startActivity(fff);
                           }
                       }
                   }
                   if (bl32==1 && bl31==2 &&bl21==1 && bl22==2 && step==5)
                   {
                       if (bl13==1)
                       {
                           ((Button ) b33).setText("O");
                           bl33=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);
                       }
                       else
                       {
                           ((Button ) b13).setText("O");
                           bl13=2;
                           step++;
                           Intent fff=new Intent(mainpage.this,LastPage.class);
                           startActivity(fff);
                       }
                   }

               }
    }
    int randomge()
    {
        Random rand =new Random();
        int no=rand.nextInt(4);
        return no;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        final Button bu11=findViewById(R.id.b11);
        final Button bu12=findViewById(R.id.b12);
        final Button bu13=findViewById(R.id.b13);
        final Button bu21=findViewById(R.id.b21);
        final Button bu22=findViewById(R.id.b22);
        final Button bu23=findViewById(R.id.b23);
        final Button bu31=findViewById(R.id.b31);
        final Button bu32=findViewById(R.id.b32);
        final Button bu33=findViewById(R.id.b33);



        bu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl11==0) {



                }
            }
        });
        bu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl12==0) {
                    ((Button) bu12).setText("X");
                    bl12 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }
            }
        });
        bu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl13==0) {
                    ((Button) bu13).setText("X");
                    bl13 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl21==0) {
                    ((Button) bu21).setText("X");
                    bl21 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl22==0) {
                    ((Button) bu22).setText("X");
                    bl22 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl23==0) {
                    ((Button) bu23).setText("X");
                    bl23 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl31==0) {
                    ((Button) bu31).setText("X");
                    bl31 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl32==0) {
                    ((Button) bu32).setText("X");
                    bl32 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });
        bu33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bl33==0) {
                    ((Button) bu33).setText("X");
                    bl33 = 1;
                    checkings(bu11,bu12,bu13,bu21,bu22,bu23,bu31,bu32,bu33);
                    step++;
                }

            }
        });



    }
}
