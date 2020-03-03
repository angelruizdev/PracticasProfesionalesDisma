package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class pn21 extends Activity {
    public Button bt01,bt02,bt03,bt04;
    public MediaPlayer mp01,mp02,mp03,mp04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn21);

        bt01 = (Button) findViewById(R.id.bt01);
        bt02 = (Button) findViewById(R.id.bt02);
        bt03 = (Button) findViewById(R.id.bt03);
        bt04 = (Button) findViewById(R.id.bt04);

        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
                mp01 = MediaPlayer.create(pn21.this, R.raw.selerest);
                mp01.start();
            }
        },1000);
    }
    public void OnClick(View v) {
        //AlertDialog.Builder ventanas = new AlertDialog.Builder(pn20.this);
        switch (v.getId()) {
            case R.id.bt01:
                mp01 = MediaPlayer.create(pn21.this, R.raw.mbresta);
                mp01.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent back2 = new Intent(pn21.this, pn22.class);
                        startActivity(back2);
                    }
                }, 1500);
                break;
            case R.id.bt02:
                mp02 = MediaPlayer.create(pn21.this, R.raw.volv);
                mp02.start();
                break;
            case R.id.bt03:
                mp03 = MediaPlayer.create(pn21.this, R.raw.volv1);
                mp03.start();
                break;
            case R.id.bt04:
                mp04 = MediaPlayer.create(pn21.this, R.raw.selerest);
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



/*
public class pn21 extends Activity {
    public RadioButton rb1, rb2;
    public Button bt3;
    int suma = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn21);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        bt3 = (Button) findViewById(R.id.bt3);
    }

    public void onClick(View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(this);

        switch (v.getId()){

            case R.id.rb1:
                suma = suma - suma;
                rb2.setEnabled(true);
                break;

            case R.id.rb2:
                suma = suma + 1;
                rb2.setEnabled(false);
                break;

            case R.id.bt3:


                if(!rb1.isChecked() && !rb2.isChecked()){
                    //se utiliza este toast para onclicListener
                    //Toast.makeText(getApplicationContext(), "¡Complete el Test!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(this,"Selecciona la respuesta",Toast.LENGTH_LONG).show();

                }else if(suma == 1){

                    ventanas.setIcon(R.drawable.bien);
                    ventanas.setTitle("Muy bien \n\n");
                    ventanas.setMessage("Este signo es la resta.\n\n\n");
                    ventanas.setPositiveButton("---->", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             Intent volver = new Intent(pn21.this, pn22.class);
                             startActivity(volver);
                         }
                     });

                    ventanas.show();
                }else if(suma != 1){

                    ventanas.setIcon(R.drawable.bien1);
                    ventanas.setTitle("Oooh \n\n");
                    ventanas.setMessage("Esta no es la resta.\n\n\n");
                    ventanas.setNeutralButton("<----", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ventanas.show();
                }
                break;
        }
    }
}

*/
