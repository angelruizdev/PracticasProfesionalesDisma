package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class n3 extends Activity {
    public Button btnNuevo, btnMenu;
    int salir = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_n3);

        btnNuevo = (Button) findViewById(R.id.btnNuevo);
        btnMenu = (Button) findViewById(R.id.btnMenu);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nuevo = new Intent(n3.this, pn20.class);
                startActivity(Nuevo);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(n3.this, Menus.class);
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
