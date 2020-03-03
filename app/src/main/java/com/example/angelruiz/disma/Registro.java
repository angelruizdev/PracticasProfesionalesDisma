package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends Activity {

    public EditText et1, et2, et3;
    public Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);

        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
    }

    public void registro(View v){
        AlertDialog.Builder ventana = new AlertDialog.Builder(this);
        if(et1.getText().toString().equals("") || et2.getText().toString().equals("") || et3.getText().toString().equals("")){

            Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show();
        }else{

            conexion admin = new conexion(this, "dismat", null,1);
            SQLiteDatabase db = admin.getWritableDatabase();

            String usuario = et1.getText().toString();
            String correo = et2.getText().toString();
            String contrasena = et3.getText().toString();

            ContentValues values = new ContentValues();

            values.put("usuario", usuario);
            values.put("correo", correo);
            values.put("contrasena", contrasena);

            db.insert("usuarios", null, values);
            db.close();


            ventana.setIcon(R.drawable.regist);
            ventana.setTitle("Exelente");
            ventana.setMessage("Se ha registrado con exito");
            ventana.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent ir = new Intent(Registro.this, Menus.class);
                    startActivity(ir);
                }
            });
            ventana.show();
        }
    }

    public void login(View v){

        Intent ir1 = new Intent(this, Login.class);
        startActivity(ir1);
    }
}
