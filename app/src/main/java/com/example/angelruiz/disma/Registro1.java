package com.example.angelruiz.disma;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class Registro1 extends Activity implements Response.Listener<JSONObject>,Response.ErrorListener{

    EditText campoUsuario,campoEmail,campoPassword;
    CheckBox chbTC;
    Button botonRegistro;
    ProgressDialog progreso;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registro1);

        campoUsuario= (EditText)findViewById(R.id.campoUsu);
        campoEmail= (EditText) findViewById(R.id.campoEma);
        campoPassword= (EditText)findViewById(R.id.campoPass);
        botonRegistro= (Button) findViewById(R.id.btnRegistrar);
        chbTC= (CheckBox)findViewById(R.id.chbTC);

        request= Volley.newRequestQueue(this);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = campoUsuario.getText().toString();
                String email = campoEmail.getText().toString();
                String contraseña = campoPassword.getText().toString();

                if(TextUtils.isEmpty(usuario)){
                    campoUsuario.setError("El campo es obligatorio");
                    campoUsuario.requestFocus();
                    return;
                }else if(!campoEmail.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")){
                    campoEmail.setError("Direccion no valida");
                    campoEmail.requestFocus();
                    return;
                }else if(TextUtils.isEmpty(contraseña)){
                    campoPassword.setError("El campo es obligatorio");
                    campoPassword.requestFocus();
                    return;
                }else if(!chbTC.isChecked()) {
                    Toast.makeText(Registro1.this, "Acepto terminos y condiciones", Toast.LENGTH_LONG).show();
                    chbTC.setError("Acepto terminos y condiciones");
                    chbTC.requestFocus();
                    return;
                }else{
                    //Email();
                    cargarWebService();
                    //Intent entrar = new Intent(Registro1.this, Menus.class);
                    //startActivity(entrar);
                }
             }
        });
    }
    private void cargarWebService() {

        progreso=new ProgressDialog(this);
        progreso.setMessage("Cargando...");
        progreso.show();
                          //192.168.1.5/SERV_WEB/wsJSONRegistro.php?//-->forma_local
        String url="http://farmaciainteligente.esy.es/JSON/wsJSONRegistro.php?documento="+campoUsuario.getText().toString()+
                     "&nombre="+campoEmail.getText().toString()+"&profesion="+campoPassword.getText().toString();

        url=url.replace(" ","%20");

        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        request.add(jsonObjectRequest);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        progreso.hide();
        Toast.makeText(this,"No se pudo registrar "+error.toString(),Toast.LENGTH_LONG).show();
        Log.i("ERROR",error.toString());
    }
    @Override
    public void onResponse(JSONObject response) {
        AlertDialog.Builder registro = new AlertDialog.Builder(this);

        progreso.hide();
        campoUsuario.setText("");
        campoEmail.setText("");
        campoPassword.setText("");

        View view = getLayoutInflater().inflate(R.layout.alertperso2, null);
        registro.setView(view);
        registro.setCancelable(false);
        Button btnRegistrar = (Button)view.findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entrar = new Intent(Registro1.this, Menus.class);
                startActivity(entrar);
            }
        });
      AlertDialog aler = registro.create();
        aler.show();
    }
    public void Email(){

        Intent enviar = new Intent(android.content.Intent.ACTION_SEND);
        enviar.setData(Uri.parse("mailto:"));
        enviar.setType("text/plain");
        String[]to={campoEmail.getText().toString()};
        enviar.putExtra(Intent.EXTRA_EMAIL, to);
        enviar.putExtra(Intent.EXTRA_SUBJECT, "Verifique sus datos:");
        //enviar.putExtra(Intent.EXTRA_SUBJECT, campoUsuario.getText().toString());
        //enviar.putExtra(Intent.EXTRA_EMAIL, campoEmail.getText().toString());
        //enviar.putExtra(Intent.EXTRA_TEXT, campoPassword.getText().toString());
        String nom = campoUsuario.getText().toString();
        String email = campoEmail.getText().toString();
        String pass = campoPassword.getText().toString();
        enviar.putExtra(Intent.EXTRA_TEXT, "Usuario:"+nom+"\n"+"Correo:"+email+"\n"+"Contraseña:"+pass);
        startActivity(Intent.createChooser(enviar, "Espera"));

            //cargarWebService();
    }
}
