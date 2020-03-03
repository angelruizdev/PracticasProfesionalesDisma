package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {

    public EditText et01, et02;
    public Button bt01;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et01 = (EditText)findViewById(R.id.et01);
        et02 = (EditText)findViewById(R.id.et02);
        bt01 = (Button)findViewById(R.id.bt01);
    }

    public void login (View v) {
        AlertDialog.Builder ventanas = new AlertDialog.Builder(this);

        conexion admin = new conexion(this, "dismat", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String correo = et01.getText().toString();
        String contrasena = et02.getText().toString();

        if(et01.getText().toString().equals("") && et02.getText().toString().equals("")) {
            Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show();
        }else{

            fila = db.rawQuery("select correo,contrasena from usuarios where correo='" + correo + "' and contrasena='" + contrasena + "'", null);

            if (fila.moveToFirst()) {

                String email = fila.getString(0);
                String pass = fila.getString(1);

                if (correo.equals(email) && contrasena.equals(pass)) {

                    Intent ingresas = new Intent(this, Menus.class);
                    startActivity(ingresas);
                    et01.setText("");
                    et02.setText("");

                }

            } else {
                ventanas.setIcon(R.drawable.deneg);
                ventanas.setTitle(("Registrate"));
                ventanas.setMessage("Aun no estas rejistrado."+"\n"+"Usuario o contraseña incorrectos");
                ventanas.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
                        Intent back = new Intent(Login.this, Registro.class);
                         startActivity(back);
                    }
                });
                ventanas.show();
            }
        }
    }
}