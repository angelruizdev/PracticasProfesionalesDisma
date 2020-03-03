package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MensajePerso extends Activity {
    //android:theme="@style/Theme.Transparent"
    private Button btnBienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mensaje_perso);

        btnBienvenido = (Button)findViewById(R.id.btnBienvenido);
        btnBienvenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bienvenido = new Intent(MensajePerso.this, Menus.class);
                startActivity(bienvenido);
            }
        });
    }
}
