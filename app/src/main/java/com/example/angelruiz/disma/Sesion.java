package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Sesion extends Activity {

    public Button btnNuevo, btnMenu;
    int salir = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.sesion);

        btnNuevo = (Button) findViewById(R.id.btnNuevo);
        btnMenu = (Button) findViewById(R.id.btnMenu);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nuevo = new Intent(Sesion.this, pn32.class);
                startActivity(Nuevo);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Sesion.this, Menus.class);
                startActivity(Menu);
            }
        });
    }
}
