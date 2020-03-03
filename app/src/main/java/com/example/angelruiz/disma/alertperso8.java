package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class alertperso8 extends Activity {
    public TextView tvAciertos2;
    public Button btnCintinuar2,btnMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_alertperso8);

        tvAciertos2 = (TextView)findViewById(R.id.tvAciertos2);
        btnCintinuar2 = (Button)findViewById(R.id.btnContinuar2);
        btnMenu2 = (Button)findViewById(R.id.btnMenu2);

        Bundle hacer1 = getIntent().getExtras();
        String entrada1 = hacer1.getString("DATOS1");
        TextView vistatexto1 = (TextView)findViewById(R.id.tvAciertos2);
        vistatexto1.setText(entrada1);

        btnCintinuar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente2 = new Intent(alertperso8.this, pn32.class);
                startActivity(siguiente2);
            }
        });
        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente3 = new Intent(alertperso8.this, Menus.class);
                startActivity(siguiente3);
            }
        });
      }
    @Override
    public void onBackPressed() {
        Intent atras1 = new Intent(this, Menus.class);
        startActivity(atras1);
    }
}
