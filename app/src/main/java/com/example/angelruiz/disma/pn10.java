package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class pn10 extends Activity {

    public Button bt01, bt02, bt03, bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn10);

        bt01 = (Button)findViewById(R.id.bt01);
        bt02 = (Button)findViewById(R.id.bt02);
        bt03 = (Button)findViewById(R.id.bt03);
        bt04 = (Button)findViewById(R.id.bt04);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mp01 = MediaPlayer.create(pn10.this, R.raw.cpera);
                mp01.start();
            }
        },1000);
    }

    public void ver1 (View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(pn10.this);
        switch (v.getId()){
            case R.id.bt01:
                mp01 = MediaPlayer.create(pn10.this, R.raw.vco);
                mp01.start();
                break;
            case R.id.bt02:
                mp02 = MediaPlayer.create(pn10.this, R.raw.mpera10);
                mp02.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent pas1 = new Intent(pn10.this, num1_mensaje.class);
                        startActivity(pas1);
                    }
                },2000);
                break;
            case R.id.bt03:
                mp03 = MediaPlayer.create(pn10.this, R.raw.tpu);
                mp03.start();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(pn10.this, R.raw.cpera);
                mp04.start();
                break;
        }
    }
}
