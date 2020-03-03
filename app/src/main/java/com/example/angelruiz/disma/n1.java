package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class n1 extends Activity implements View.OnClickListener {

    public MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp011;
    public Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_n1);

        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        bt10 = (Button)findViewById(R.id.bt10);

        mp1 = MediaPlayer.create(this, R.raw.uno);
        mp2 = MediaPlayer.create(this, R.raw.dos);
        mp3 = MediaPlayer.create(this, R.raw.tres);
        mp4 = MediaPlayer.create(this, R.raw.cuatro);
        mp5 = MediaPlayer.create(this, R.raw.cinco);
        mp6 = MediaPlayer.create(this, R.raw.seis);
        mp7 = MediaPlayer.create(this, R.raw.siete);
        mp8 = MediaPlayer.create(this, R.raw.ocho);
        mp9 = MediaPlayer.create(this, R.raw.nueve);
        mp10 = MediaPlayer.create(this, R.raw.diez);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mp011 = MediaPlayer.create(n1.this, R.raw.tnum);
                mp011.start();
            }
        },1000);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt1:
                mp1.start();
                Intent ir2 = new Intent(this, num1.class);
                startActivity(ir2);
            break;

           case R.id.bt2:
                   mp2.start();
                   Intent ir1 = new Intent(this, num2.class);
                   startActivity(ir1);
           break;

           case R.id.bt3:
               mp3.start();
               Intent ir3 = new Intent(this, num3.class);
           startActivity(ir3);
               break;

           case R.id.bt4:
                   mp4.start();
                   Intent ir4 = new Intent(this, num4.class);
                   startActivity(ir4);
           break;

           case R.id.bt5:
                   mp5.start();
                   Intent ir5 = new Intent(this, num5.class);
                   startActivity(ir5);
           break;

           case R.id.bt6:
               mp6.start();
               Intent ir6 = new Intent(this, num6.class);
               startActivity(ir6);
           break;

           case R.id.bt7:
               mp7.start();
               Intent ir7 = new Intent(this, num7.class);
               startActivity(ir7);
           break;

           case R.id.bt8:
               mp8.start();
               Intent ir8 = new Intent(this, num8.class);
               startActivity(ir8);
           break;

           case R.id.bt9:
               mp9.start();
               Intent ir9 = new Intent(this, num9.class);
               startActivity(ir9);
           break;

            case R.id.bt10:
                mp10.start();
                 Intent ir10 = new Intent(this, num10.class);
                  startActivity(ir10);
            break;

            case R.id.bt11:
                Intent ir11 = new Intent(this, Menus.class);
                startActivity(ir11);
                break;

            case R.id.bt12:
                mp011.start();
                break;
       }
    }
    @Override
    public void onBackPressed() {
        if(contador == 0){
            super.onBackPressed();
            Intent backn1 = new Intent(n1.this, Menus.class);
            startActivity(backn1);
        }
        }
        }

