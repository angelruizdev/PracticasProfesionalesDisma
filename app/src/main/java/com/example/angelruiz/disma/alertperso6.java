package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class alertperso6 extends Activity {
    public TextView tvAciertos;
    public Button btnContinuar,btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.alertperso6);

        tvAciertos = (TextView)findViewById(R.id.tvAciertos);
        btnContinuar = (Button)findViewById(R.id.btnContinuar);
        btnMenu = (Button)findViewById(R.id.btnMenu);

        Bundle bundle = getIntent().getExtras();
        String input = bundle.getString("VARIABLES");
        TextView textView = (TextView)findViewById(R.id.tvAciertos);
        textView.setText(input);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continuar = new Intent(alertperso6.this, pn30.class);
                startActivity(continuar);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continuar1 = new Intent(alertperso6.this, Menus.class);
                startActivity(continuar1);
            }
        });
      }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(this, Menus.class);
        startActivity(back);
    }
}
