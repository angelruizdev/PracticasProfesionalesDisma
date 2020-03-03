package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class n2 extends Activity implements View.OnClickListener {

    public Button bt0,bt1,bt2,bt3,bt4,bt5,bt6;
    int suma1, suma2, suma3, suma4, suma5 = 0;
    public MediaPlayer mpa, mpb, mpc, mpd, mpe, mpf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_n2);

        bt0 = (Button)findViewById(R.id.bt0);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);

        mpa = MediaPlayer.create(this, R.raw.suma);
        mpb = MediaPlayer.create(this, R.raw.resta);
        mpc = MediaPlayer.create(this, R.raw.mult);
        mpd = MediaPlayer.create(this, R.raw.divis);
        mpe = MediaPlayer.create(this, R.raw.igual);
        mpf = MediaPlayer.create(this, R.raw.tsigno);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bt1:
                mpa.start();
                int [] array = new int[1];
                suma1 = suma1 + array.length;

                bt1.setEnabled(false);
                break;

            case R.id.bt2:
                mpb.start();
                suma2 = suma2 + 1;

                bt2.setEnabled(false);
                break;

            case R.id.bt3:
                mpc.start();
                suma3 = suma3 + 1;

                bt3.setEnabled(false);
                break;

            case R.id.bt4:
                mpd.start();
                suma4 = suma4 + 1;

                bt4.setEnabled(false);
                break;

            case R.id.bt5:
                mpe.start();
                suma5 = suma5 + 1;

                bt5.setEnabled(false);
                break;

            case R.id.bt6:
                mpf.start();
                break;

            case R.id.bt0:

                int total = suma1 + suma2 + suma3 + suma4 + suma5;

                if(total >= 5) {

                    bt0.setEnabled(true);
                    bt1.setEnabled(true);
                    bt2.setEnabled(true);
                    bt3.setEnabled(true);
                    bt4.setEnabled(true);
                    bt5.setEnabled(true);

                    Intent ir5 = new Intent(this, pn20.class);
                    startActivity(ir5);

                }else{

                    bt0.setEnabled(true);
                    Toast.makeText(this,"Toca cada signo", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
