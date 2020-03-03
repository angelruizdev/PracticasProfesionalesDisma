package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class alertperso7 extends Activity {
    public TextView tvAciertos1;
    public Button btnContinuar1,btnMenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_alertperso7);

         tvAciertos1 = (TextView)findViewById(R.id.tvAciertos1);
         btnContinuar1 = (Button)findViewById(R.id.btnContinuar1);
         btnMenu1 = (Button)findViewById(R.id.btnMenu1);

         Bundle hacer = getIntent().getExtras();
         String entrada = hacer.getString("DATOS");
         TextView vistaTexto = (TextView)findViewById(R.id.tvAciertos1);
         vistaTexto.setText(entrada);

         btnContinuar1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent siguiente1 = new Intent(alertperso7.this, pn31.class);
                 startActivity(siguiente1);
             }
         });
         btnMenu1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent siguiente2 = new Intent(alertperso7.this, Menus.class);
                 startActivity(siguiente2);
             }
         });
       }
    @Override
    public void onBackPressed() {
        Intent atras = new Intent(this, Menus.class);
        startActivity(atras);
    }
}
