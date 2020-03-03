package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class examen extends Activity implements View.OnClickListener {

    public Button  btn11;
    public RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18, rb19,rb20;
    int suma, suma1, suma2, suma3, suma4, suma5, suma6, suma7, suma8, suma9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test);

        btn11 = (Button) findViewById(R.id.bt11);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);
    }

    @Override
    public void onClick(View v) {

        AlertDialog.Builder ventanas = new AlertDialog.Builder(this);

        switch (v.getId()){

            case R.id.rb1:
            suma = suma + 1;
                rb1.setEnabled(false);
                //Toast.makeText(this,"es"+suma,Toast.LENGTH_SHORT).show();
                break;

            case R.id.rb2:
                suma = suma - suma;
                rb1.setEnabled(true);
                //Toast.makeText(this,"es"+suma1,Toast.LENGTH_SHORT).show();
                break;

            case R.id.rb3:
                suma1 = suma1 + 1;
                rb3.setEnabled(false);
                break;

            case R.id.rb4:
                suma1 = suma1 - suma1;
                rb3.setEnabled(true);
                break;

            case R.id.rb5:
                suma2 = suma2 + 1;
                rb5.setEnabled(false);
                break;

            case R.id.rb6:
                suma2 = suma2 - suma2;
                rb5.setEnabled(true);
                break;

            case R.id.rb7:
                suma3 = suma3 + 1;
                rb7.setEnabled(false);
                break;

            case R.id.rb8:
                suma3 = suma3 - suma3;
                rb7.setEnabled(true);
                break;

            case R.id.rb9:
                suma4 = suma4 + 1;
                rb9.setEnabled(false);
                break;

            case R.id.rb10:
                suma4 = suma4 - suma4;
                rb9.setEnabled(true);
                break;

            case R.id.rb11:
                suma5 = suma5 + 1;
                rb11.setEnabled(false);
                break;

            case R.id.rb12:
                suma5 = suma5 - suma5;
                rb11.setEnabled(true);
                break;

            case R.id.rb13:
                suma6 = suma6 + 1;
                rb13.setEnabled(false);
                break;

            case R.id.rb14:
                suma6 = suma6 - suma6;
                rb13.setEnabled(true);
                break;

            case R.id.rb15:
                suma7 = suma7 + 1;
                rb15.setEnabled(false);
                break;

            case R.id.rb16:
                suma7 = suma7 - suma7;
                rb15.setEnabled(true);
                break;

            case R.id.rb17:
                suma8 = suma8 + 1;
                rb17.setEnabled(false);
                break;

            case R.id.rb18:
                suma8 = suma8 - suma8;
                rb17.setEnabled(true);
                break;

            case R.id.rb19:
                suma9 = suma9 + 1;
                rb19.setEnabled(false);
                break;

            case R.id.rb20:
                suma9 = suma9 - suma9;
                rb19.setEnabled(true);
                break;


            case R.id.bt11:
                int total = suma + suma1 + suma2 + suma3 + suma4 + suma5 + suma6 + suma7 + suma8 + suma9;

               if(total == 10 || total == 9 || total == 8 || total == 7 || total == 6) {

                        ventanas.setIcon(R.drawable.test1);
                        ventanas.setTitle("Resultados \n");
                        ventanas.setMessage("Al parecer cumple con gran parte de los problemas.\n\nEs muy probable que tenga Discalculia.\n\n\n\n");
                        ventanas.setNeutralButton("Volver", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent volver = new Intent(examen.this,Menus.class);
                                startActivity(volver);
                            }
                        });
                        ventanas.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ventanas.show();

                    }else if(total == 5){

                   ventanas.setIcon(R.drawable.test1);
                   ventanas.setTitle("Resultados \n");
                   ventanas.setMessage("Cumple con la mitad de los problemas.\n\nExiste la pisibilidad de que tenga Discalculia.\n\n\n\n");
                   ventanas.setNeutralButton("Volver", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           Intent volver = new Intent(examen.this,Menus.class);
                           startActivity(volver);
                       }
                   });
                   ventanas.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                       }
                   });
                   ventanas.show();

                    }else if(total == 0){

                   Toast.makeText(this, "¡Complete el Test!", Toast.LENGTH_SHORT).show();

                    }else if(total <= 4){

                   ventanas.setIcon(R.drawable.test1);
                   ventanas.setTitle("Resultados \n");
                   ventanas.setMessage("No cumple con ningun problema.\n\nTal vez solo sea un mal entendimiento de las Matematicas.\n\n\n\n");
                   ventanas.setNeutralButton("Volver", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           Intent volver = new Intent(examen.this,Menus.class);
                           startActivity(volver);
                       }
                   });
                   ventanas.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
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

