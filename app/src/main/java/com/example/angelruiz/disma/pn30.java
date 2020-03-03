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

public class pn30 extends Activity implements View.OnClickListener {
    //android:theme="@android:style/Theme.Translucent"
    ProgressBar pBar;
    public EditText entrada,entrada1;
    public TextView salida,salida1,salida3;
    public Button bt1,op1,op2,op3,btnSuma,btnInicio,btnSiguiente,tvResult,uno;
    public MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6;
    private int intentos = 5;
    private int buenas = 0;
    public int malas = 0;
    public int total;

    private int num1, num2, num3, num4, num5,suma,suma1,res,res1,res2,ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pn30);

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
        num1 = rand.nextInt(3) + 1;
        salida = (TextView) findViewById(R.id.salida);
        String myString = String.valueOf(num1);
        salida.setText(myString);

        num2 = rand.nextInt(2) + 1;
        salida1 = (TextView) findViewById(R.id.salida1);
        String myString1 = String.valueOf(num2);
        salida1.setText(myString1);

        suma = num1 + num2;
        suma1 = suma;

        int x = 1;
        while(x <= 10) {

            num3 = rand.nextInt(5) + 1;
            op1 = (Button) findViewById(R.id.op1);
            num4 = rand.nextInt(5) + 1;
            op2 = (Button) findViewById(R.id.op2);
            num5 = rand.nextInt(5) + 1;
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
        num1 = rand.nextInt(3) + 1;
        salida = (TextView) findViewById(R.id.salida);
        String myString = String.valueOf(num1);
        salida.setText(myString);

        num2 = rand.nextInt(2) + 1;
        salida1 = (TextView) findViewById(R.id.salida1);
        String myString1 = String.valueOf(num2);
        salida1.setText(myString1);

        suma = num1 + num2;
        suma1 = suma;

        int x = 1;
        while(x <= 10) {

        num3 = rand.nextInt(5) + 1;
        op1 = (Button) findViewById(R.id.op1);
        num4 = rand.nextInt(5) + 1;
        op2 = (Button) findViewById(R.id.op2);
        num5 = rand.nextInt(5) + 1;
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
        AlertDialog.Builder ventanas = new AlertDialog.Builder(pn30.this);
        intentos--;

        res = Integer.parseInt(op1.getText().toString());
        res1 = Integer.parseInt(op2.getText().toString());
        res2 = Integer.parseInt(op3.getText().toString());
        //MainActivity.this.finish();
        if (v.getId() == R.id.op1 && suma1 == res) {
            buenas++;
            mp3.start();
            if (buenas == 5) {
                mp3.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Random rand = new Random();
                    num1 = rand.nextInt(3) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(2) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while (x <= 10) {

                        num3 = rand.nextInt(5) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(5) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(5) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if (suma1 == num3 || suma1 == num4 || suma1 == num5) {
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
            }, 2000);

            String enviar = String.valueOf(res);
            entrada.setText(enviar);

        } else if (v.getId() == R.id.op2 && suma1 == res1) {
            buenas++;
            mp4.start();
            if (buenas == 5) {
                mp4.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(3) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(2) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while (x <= 10) {

                        num3 = rand.nextInt(5) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(5) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(5) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if (suma1 == num3 || suma1 == num4 || suma1 == num5) {
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
            }, 1000);

            String enviar1 = String.valueOf(res1);
            entrada.setText(enviar1);

        } else if (v.getId() == R.id.op3 && suma1 == res2) {
            buenas++;
            mp5.start();
            if (buenas == 5) {
                mp5.stop();
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(3) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(2) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while (x <= 10) {

                        num3 = rand.nextInt(5) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(5) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(5) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if (suma1 == num3 || suma1 == num4 || suma1 == num5) {
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
            }, 1000);

            String enviar2 = String.valueOf(res2);
            entrada.setText(enviar2);

        } else {
            mp6.start();
            entrada.setText("x");
            malas++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Random rand = new Random();
                    num1 = rand.nextInt(3) + 1;
                    salida = (TextView) findViewById(R.id.salida);
                    String myString = String.valueOf(num1);
                    salida.setText(myString);

                    num2 = rand.nextInt(2) + 1;
                    salida1 = (TextView) findViewById(R.id.salida1);
                    String myString1 = String.valueOf(num2);
                    salida1.setText(myString1);

                    suma = num1 + num2;
                    suma1 = suma;

                    int x = 1;
                    while (x <= 10) {

                        num3 = rand.nextInt(5) + 1;
                        op1 = (Button) findViewById(R.id.op1);
                        num4 = rand.nextInt(5) + 1;
                        op2 = (Button) findViewById(R.id.op2);
                        num5 = rand.nextInt(5) + 1;
                        op3 = (Button) findViewById(R.id.op3);

                        if (suma1 == num3 || suma1 == num4 || suma1 == num5){
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
        if (intentos == 0 && buenas == 5) {
            mp1.start();
            AlertDialog.Builder ventanas1 = new AlertDialog.Builder(pn30.this);

            View view1 = getLayoutInflater().inflate(R.layout.alertperso4, null);
            ventanas1.setView(view1);
            ventanas1.setCancelable(false);
            btnSiguiente = (Button) view1.findViewById(R.id.btnSiguiente);

            btnSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent siguiente = new Intent(pn30.this, pn31.class);
                    startActivity(siguiente);
                }
            });
            AlertDialog alert = ventanas1.create();
            alert.show();
        } else if (intentos == 0 && buenas < 5){

            Intent variables = new Intent(this, alertperso6.class);
            Bundle bundle = new Bundle();
            bundle.putString("VARIABLES", String.valueOf(buenas + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + malas));
            variables.putExtras(bundle);
            startActivity(variables);
        }
        total = buenas;

            if (total == 1) {
                tvResult.setText(String.valueOf(total));
                pBar.setProgress(20);
            } else if (total == 2) {
                tvResult.setText(String.valueOf(total));
                pBar.setProgress(40);
            } else if (total == 3) {
                tvResult.setText(String.valueOf(total));
                pBar.setProgress(60);
            } else if (total == 4) {
                tvResult.setText(String.valueOf(total));
                pBar.setProgress(80);
            } else if (total == 5) {
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

/*
       AlertDialog.Builder ventanas = new AlertDialog.Builder(this);

        if (entrada.getText().toString().equals("")) {
            bt2.setEnabled(true);
            Toast.makeText(this,"Debes poner el resultado", Toast.LENGTH_LONG).show();

        } else {

            int sum = num1 + num2;

            for(int i = 1; i <= 1; i++ ) {
                ingresar = Integer.parseInt(entrada.getText().toString());
                if(sum == ingresar) {

                   tot = tot + 1;
                    //tot += ingresar;

                    //Toast.makeText(this, "total" + tot, Toast.LENGTH_SHORT).show();
                }else{
                    //Toast.makeText(this, "fallaste", Toast.LENGTH_SHORT).show();
                }
            }
                 //int x = 5;
            //while(x <= 5){

                // ingresar1 = Integer.parseInt(entrada.getText().toString());
                //  x++;
           // }

               if (sum == ingresar) {
                   intentos = intentos - 1;

                    ventanas.setIcon(R.drawable.bien);
                    ventanas.setTitle(("MUY BIEN\n\n"));
                    ventanas.setMessage("Felicidades.\n\n La suma de: " + num1 + " + " + num2 + " es, " + ingresar+"\n\n\n");
                    ventanas.setPositiveButton("---->", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                            Random rand = new Random();
                            num1 = rand.nextInt(4) + 1;
                            salida = (TextView) findViewById(R.id.salida);
                            String myString = String.valueOf(num1);
                            salida.setText(myString);

                            num2 = rand.nextInt(4) + 1;
                            salida1 = (TextView) findViewById(R.id.salida1);
                            String myString1 = String.valueOf(num2);
                            salida1.setText(myString1);

                            entrada.setText("");
                            bt2.setEnabled(true);

                            //entrada.setText("");
                        }
                    });
                    ventanas.show();

                    //Toast.makeText(this,  "bien la suma es"+ingresar, Toast. LENGTH_SHORT) .show();

                } else {
                   intentos = intentos - 1;

                    ventanas.setIcon(R.drawable.bien1);
                    ventanas.setTitle(("Oooh"));
                    ventanas.setMessage("La suma de: " + num1 + " + " + num2 + " no es, " + ingresar);
                    ventanas.setPositiveButton("---->", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Random rand = new Random();
                            num1 = rand.nextInt(4) + 1;
                            salida = (TextView) findViewById(R.id.salida);
                            String myString = String.valueOf(num1);
                            salida.setText(myString);

                            num2 = rand.nextInt(4) + 1;
                            salida1 = (TextView) findViewById(R.id.salida1);
                            String myString1 = String.valueOf(num2);
                            salida1.setText(myString1);

                            entrada.setText("");
                            bt2.setEnabled(true);

                        }
                    });
                    ventanas.show();

                }

            if (intentos == 0 && tot == 5) {

                mp1.start();
                bt2.setEnabled(false);
                ventanas.setIcon(R.drawable.bien);
                ventanas.setTitle(("Felicidades."));
                ventanas.setMessage("Tu calificación es de 10. \n\n ¡Ve al siguiente nivel! \n\n\n\n\n");


                ventanas.setPositiveButton("---->", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                     Intent inicio = new Intent(pn30.this, pn31.class);
                     startActivity(inicio);
                    }
                });
                ventanas.show();

            } else if(intentos == 0 && tot <= 4) {
                bt2.setEnabled(false);
                ventanas.setIcon(R.drawable.bien1);
                ventanas.setTitle(("Oye...\n\n"));
                ventanas.setMessage("Tuviste: " + tot + " aciertos de 5, ejercicios. \n\n\n\n\n ¡Vuelbe jugar!");

                ventanas.setNeutralButton("<----", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent volver = new Intent(pn30.this, Menus.class);
                        startActivity(volver);
                    }
                });
                ventanas.setPositiveButton("Jugar de nuevo", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent inicio = new Intent(pn30.this, pn30.class);
                        startActivity(inicio);
                    }
                });
                ventanas.show();


               }else{
                bt2.setEnabled(false);

               }
              }
              */


