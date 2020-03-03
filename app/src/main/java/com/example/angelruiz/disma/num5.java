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

public class num5 extends Activity {

    public Button bt01,bt02,bt03,bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_num5);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              mp01 = MediaPlayer.create(num5.this, R.raw.n5);
              mp01.start();
            }
        },1000);
    }
    public void OnClick(View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(num5.this);
        switch (v.getId()) {
            case R.id.bt01:
                mp01 = MediaPlayer.create(num5.this, R.raw.volv);
                mp01.start();
                break;
            case R.id.bt02:
                mp02 = MediaPlayer.create(num5.this, R.raw.volv1);
                mp02.start();

                break;
            case R.id.bt03:
                mp03 = MediaPlayer.create(num5.this, R.raw.nu5);
                mp03.start();
                View view = getLayoutInflater().inflate(R.layout.alertpersocinco, null);
                ventanas.setView(view);
                ventanas.setCancelable(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent back5 = new Intent(num5.this, n1.class);
                        startActivity(back5);
                    }
                },2500);
                AlertDialog alert = ventanas.create();
                alert.show();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(num5.this, R.raw.n5);
                mp04.start();
                break;
        }
    }
}
