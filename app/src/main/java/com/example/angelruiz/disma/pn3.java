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

public class pn3 extends Activity {

    public Button bt01, bt02, bt03, bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn3);

        bt01 = (Button)findViewById(R.id.bt01);
        bt02 = (Button)findViewById(R.id.bt02);
        bt03 = (Button)findViewById(R.id.bt03);
        bt04 = (Button)findViewById(R.id.bt04);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mp01 = MediaPlayer.create(pn3.this, R.raw.cpera);
                mp01.start();
            }
            },1000);
            }

    public void ver1 (View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(pn3.this);
        switch (v.getId()){
            case R.id.bt01:
                mp01 = MediaPlayer.create(pn3.this, R.raw.vco);
                mp01.start();
                break;
            case R.id.bt02:
                mp02 = MediaPlayer.create(pn3.this, R.raw.tpu);
                mp02.start();
                break;
            case R.id.bt03:
                mp03 = MediaPlayer.create(pn3.this, R.raw.mpera3);
                mp03.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent back2 = new Intent(pn3.this, Felis.class);
                        startActivity(back2);
                    }
                }, 150);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent pas1 = new Intent(pn3.this, pn4.class);
                        startActivity(pas1);
                    }
                },2000);
                //View view = getLayoutInflater().inflate(R.layout.mensaje_pn3, null);
                //ventanas.setView(view);
                //ventanas.setCancelable(false);
                //Button btpn3 = (Button)view.findViewById(R.id.btpn3);
                //btpn3.setOnClickListener(new View.OnClickListener() {
                  //  @Override
                    //public void onClick(View v) {
                      //  Intent pas1 = new Intent(pn3.this, pn4.class);
                        //startActivity(pas1);
                    //}
                //});
                //AlertDialog alert = ventanas.create();
                //alert.show();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(pn3.this, R.raw.cpera);
                mp04.start();
                break;
        }
    }
}
