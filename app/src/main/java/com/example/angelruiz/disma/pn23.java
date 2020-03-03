package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class pn23 extends Activity {
    public Button bt01,bt02,bt03,bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn23);

        bt01 = (Button) findViewById(R.id.bt01);
        bt02 = (Button) findViewById(R.id.bt02);
        bt03 = (Button) findViewById(R.id.bt03);
        bt04 = (Button) findViewById(R.id.bt04);

        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
                mp01 = MediaPlayer.create(pn23.this, R.raw.seledivi);
                mp01.start();
            }
        },1000);
    }
    public void OnClick(View v) {
        //AlertDialog.Builder ventanas = new AlertDialog.Builder(pn20.this);
        switch (v.getId()) {
            case R.id.bt01:
                mp03 = MediaPlayer.create(pn23.this, R.raw.volv1);
                mp03.start();
                break;
            case R.id.bt02:
                mp01 = MediaPlayer.create(pn23.this, R.raw.mbdivi);
                mp01.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent back2 = new Intent(pn23.this, pn24.class);
                        startActivity(back2);
                    }
                }, 1500);
                break;
            case R.id.bt03:
                mp02 = MediaPlayer.create(pn23.this, R.raw.volv);
                mp02.start();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(pn23.this, R.raw.seledivi);
                mp04.start();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(this, Menus.class);
        startActivity(back);
    }
}
