package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class num1_mensaje extends Activity {
public Button btnNuevo, btnMenu;
    int salir = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.num1_mensaje);

        btnNuevo = (Button)findViewById(R.id.btnNuevo);
        btnMenu = (Button)findViewById(R.id.btnMenu);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nuevo = new Intent(num1_mensaje.this, pn1.class);
                startActivity(Nuevo);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(num1_mensaje.this, Menus.class);
                startActivity(Menu);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (salir == 0) {
            Intent salir1 = new Intent(this, Menus.class);
            startActivity(salir1);
            //super.onBackPressed();
        }
    }
}
