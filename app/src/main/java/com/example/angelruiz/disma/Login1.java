package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Login1 extends Activity {
    EditText etUsuario, etContraseña;
    Button btnInicio;

    //lilianaroman2285@gmail.com
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login1);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña = (EditText) findViewById(R.id.etContraseña);
        btnInicio = (Button) findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuario.getText().toString();
                String contraseña = etContraseña.getText().toString();

                Thread tr = new Thread(){
                    @Override
                    public void run() {
                        final String resultado1 = enviarDatosGet(etUsuario.getText().toString(),etContraseña.getText().toString());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int r = obtDatosJson(resultado1);
                                if(r > 0){
                                    Intent acceso = new Intent(getApplicationContext(),Menus.class);
                                    startActivity(acceso);
                                }
                            }
                        });
                    }
                };
              tr.start();

                if (TextUtils.isEmpty(usuario)) {
                    etUsuario.setError("El campo es necesario");
                    etUsuario.requestFocus();
                    return;

                } else if (TextUtils.isEmpty(contraseña)) {
                    etContraseña.setError("El campo es necesario");
                    etContraseña.requestFocus();
                    return;
                }
            }
        });
    }

    public String enviarDatosGet(String nombre, String profesion) {
        URL url = null;
        String linea = "";
        int respuesta = 0;
        StringBuilder resultado = null;
         try {
           url = new URL("http://192.168.6.2/SERV_WEB/logeo.php?nombre="+nombre+"&profesion="+profesion);
             HttpURLConnection connection = (HttpURLConnection)url.openConnection();
             respuesta = connection.getResponseCode();
             resultado = new StringBuilder();
             if(respuesta == HttpURLConnection.HTTP_OK){
              InputStream in = new BufferedInputStream(connection.getInputStream());
                 BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                 while ((linea = reader.readLine())!= null){
                    resultado.append(linea);
                 }
             }
         }catch (Exception e){}
    return resultado.toString();
       }
       public int obtDatosJson(String response){
        int res = 0;
           try {
               JSONArray json = new JSONArray(response);
                 if(json.length() > 0) {
                     res = 1;
                 }
           }catch (Exception e){}
           return res;
       }
}
