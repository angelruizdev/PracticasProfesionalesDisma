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
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class pn32 extends Activity implements View.OnClickListener {

    ProgressBar pBar;
    public EditText entrada,entrada1;
    public TextView salida,salida1,salida3;
    public Button bt1,op1,op2,op3,btnSuma,btnInicio,btnSiguiente,tvResult,uno;
    public MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6;
    public int intentos = 10;
    public int buenas = 0;
    public int malas = 0;
    public int total;

    int num1, num2, num3, num4, num5,suma,suma1,res,res1,res2,ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn32);

        pBar = (ProgressBar)findViewById(R.id.pBar);
        entrada = (EditText)findViewById(R.id.entrada);
        tvResult = (Button) findViewById(R.id.tvResult);
        bt1 = (Button)findViewById(R.id.bt1);
        btnSuma = (Button)findViewById(R.id.btnSuma);
        mp1 = MediaPlayer.create(this, R.raw.calif);
        mp2 = MediaPlayer.create(this,R.raw.sigsuma);
        mp3 = MediaPlayer.create(this,R.raw.mbien);
        mp4 = MediaPlayer.create(this,R.raw.felic);
        mp5 = MediaPlayer.create(this,R.raw.exel);
        mp6 = MediaPlayer.create(this, R.raw.nsuma);
        //salida3 = (TextView)findViewById(R.id.salida3);
//________________________________________________________________________________
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mp2.start();
            }
        },1000);

        Random rand = new Random();
        num1 = rand.nextInt(5) + 1;
        salida = (TextView) findViewById(R.id.salida);
        String myString = String.valueOf(num1);
        salida.setText(myString);

        num2 = rand.nextInt(5) + 1;
        salida1 = (TextView) findViewById(R.id.salida1);
        String myString1 = String.valueOf(num2);
        salida1.setText(myString1);

        suma = num1 + num2;
        suma1 = suma;

        int x = 1;
        while(x <= 20) {

            num3 = rand.nextInt(10) + 1;
            op1 = (Button) findViewById(R.id.op1);
            num4 = rand.nextInt(10) + 1;
            op2 = (Button) findViewById(R.id.op2);
            num5 = rand.nextInt(10) + 1;
            op3 = (Button) findViewById(R.id.op3);

            if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                String opsion = String.valueOf(num3);
                op1.setText(opsion);

                String opsion1 = String.valueOf(num4);
                op2.setText(opsion1);

                String opsion2 = String.valueOf(num5);//entrada.setText(String.valueOf(buenas));
                op3.setText(opsion2);
            }
            x++;
        }
        entrada.setText("");
//________________________________________________________________________________
    }
    @Override
    public void onClick(View v) {

        Random rand = new Random();
        num1 = rand.nextInt(5) + 1;
        salida = (TextView) findViewById(R.id.salida);
        String myString = String.valueOf(num1);
        salida.setText(myString);

        num2 = rand.nextInt(5) + 1;
        salida1 = (TextView) findViewById(R.id.salida1);
        String myString1 = String.valueOf(num2);
        salida1.setText(myString1);

        suma = num1 + num2;
        suma1 = suma;

        int x = 1;
        while(x <= 20) {

            num3 = rand.nextInt(10) + 1;
            op1 = (Button) findViewById(R.id.op1);
            num4 = rand.nextInt(10) + 1;
            op2 = (Button) findViewById(R.id.op2);
            num5 = rand.nextInt(10) + 1;
            op3 = (Button) findViewById(R.id.op3);

            if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                String opsion = String.valueOf(num3);
                op1.setText(opsion);

                String opsion1 = String.valueOf(num4);
                op2.setText(opsion1);

                String opsion2 = String.valueOf(num5);
                op3.setText(opsion2);
            }
            x++;
        }
        entrada.setText("");
    }

    public void calcular(View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(pn32.this);
        intentos--;
        res = Integer.parseInt(op1.getText().toString());
        res1 = Integer.parseInt(op2.getText().toString());
        res2 = Integer.parseInt(op3.getText().toString());
        //MainActivity.this.finish();
        if (v.getId() == R.id.op1 && suma1 == res) {
            buenas++;
            mp3.start();
            if(buenas == 10){
                mp3.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(5) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(5) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while(x <= 20) {

                        num3 = rand.nextInt(10) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(10) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(10) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                            String opsion = String.valueOf(num3);
                            op1.setText(opsion);

                            String opsion1 = String.valueOf(num4);
                            op2.setText(opsion1);

                            String opsion2 = String.valueOf(num5);
                            op3.setText(opsion2);
                        }
                        x++;
                    }
                    entrada.setText("");
                }
            },2000);

            String enviar = String.valueOf(res);
            entrada.setText(enviar);

        } else if (v.getId() == R.id.op2 && suma1 == res1){
            buenas++;
            mp4.start();
            if(buenas == 10){
                mp4.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(5) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(5) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while(x <= 20) {

                        num3 = rand.nextInt(10) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(10) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(10) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                            String opsion = String.valueOf(num3);
                            op1.setText(opsion);

                            String opsion1 = String.valueOf(num4);
                            op2.setText(opsion1);

                            String opsion2 = String.valueOf(num5);
                            op3.setText(opsion2);
                        }
                        x++;
                    }
                    entrada.setText("");
                }
            },2000);
            String enviar1 = String.valueOf(res1);
            entrada.setText(enviar1);

        } else if (v.getId() == R.id.op3 && suma1 == res2){
            buenas++;
            mp5.start();
            if(buenas == 10){
                mp5.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(5) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(5) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while(x <= 20) {

                        num3 = rand.nextInt(10) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(10) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(10) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                            String opsion = String.valueOf(num3);
                            op1.setText(opsion);

                            String opsion1 = String.valueOf(num4);
                            op2.setText(opsion1);

                            String opsion2 = String.valueOf(num5);
                            op3.setText(opsion2);
                        }
                        x++;
                    }
                    entrada.setText("");
                }
            },2000);
            String enviar2 = String.valueOf(res2);
            entrada.setText(enviar2);

        }else{
            mp6.start();
            entrada.setText("x");
            malas++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Random rand = new Random();
                    num1 = rand.nextInt(5) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(5) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while(x <= 20) {

                        num3 = rand.nextInt(10) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(10) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(10) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if(suma1 == num3 || suma1 == num4 || suma1 == num5) {
                            String opsion = String.valueOf(num3);
                            op1.setText(opsion);

                            String opsion1 = String.valueOf(num4);
                            op2.setText(opsion1);

                            String opsion2 = String.valueOf(num5);
                            op3.setText(opsion2);
                        }
                        x++;
                    }
                    entrada.setText("");
                }
            },1000);
            //entrada.setTextColor(Color.parseColor("#FFFF000D"));
            //Toast.makeText(this, "suma"+suma1, Toast.LENGTH_SHORT).show();
        }
        //bt2.setEnabled(false);
        if(intentos == 0 && buenas == 10){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent pas1 = new Intent(pn32.this, Sesion.class);
                    startActivity(pas1);
                }
            },2000);
        }else if(intentos == 0 && buenas < 10){

            Intent datos1 = new Intent(this,alertperso8.class);
            Bundle hacer1 = new Bundle();
            hacer1.putString("DATOS1", String.valueOf(buenas + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + malas));
            datos1.putExtras(hacer1);
            startActivity(datos1);
        }
        total = buenas;
        if(total == 1) {
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(10);
        }else if(total == 2){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(20);
        }else if(total == 3){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(30);
        }else if(total == 4){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(40);
        }else if(total == 5){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(50);
        }else if(total == 6){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(60);
        }else if(total == 7){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(70);
        }else if(total == 8){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(80);
        }else if(total == 9){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(90);
        }else if(total == 10){
            tvResult.setText(String.valueOf(total));
            pBar.setProgress(100);
        }
    }
    public void sonido(View v){
        mp2.start();
    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(this, Menus.class);
        startActivity(back);
    }
}
