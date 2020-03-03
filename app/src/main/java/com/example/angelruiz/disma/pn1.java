package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class pn1 extends Activity {
    //public EditText et1;// int num;

    public Button bt01, bt02, bt03, bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;
    int salir = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn1);

        bt01 = (Button)findViewById(R.id.bt01);
        bt02 = (Button)findViewById(R.id.bt02);
        bt03 = (Button)findViewById(R.id.bt03);
        bt04 = (Button)findViewById(R.id.bt04);

        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
             mp01 = MediaPlayer.create(pn1.this, R.raw.cpera);
             mp01.start();
            }
            },1000);
            }
    //et1 = (EditText)findViewById(R.id.et1);
    public void ver1 (View v){
        switch (v.getId()){
            case R.id.bt01:
                mp01 = MediaPlayer.create(pn1.this, R.raw.mpera);
                mp01.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent back2 = new Intent(pn1.this, Felis.class);
                        startActivity(back2);
                    }
                }, 150);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent pas1 = new Intent(pn1.this, pn2.class);
                        startActivity(pas1);
                    }
                },2000);
                break;
            case R.id.bt02:
                mp02 = MediaPlayer.create(pn1.this, R.raw.vco);
                mp02.start();
                break;
            case R.id.bt03:
                mp03 = MediaPlayer.create(pn1.this, R.raw.tpu);
                mp03.start();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(pn1.this, R.raw.cpera);
                mp04.start();
                break;
        }
        }
    @Override
    public void onBackPressed() {
        if(salir == 0){
            Intent salir = new Intent(this, Menus.class);
            startActivity(salir);
            //super.onBackPressed();
        }
    }
}