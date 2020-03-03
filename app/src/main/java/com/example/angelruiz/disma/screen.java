package com.example.angelruiz.disma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

    new Handler(). postDelayed(new Runnable(){
        @Override
        public void run() {
            Intent intent = new Intent(screen.this, MensajePerso.class);
              startActivity(intent);
        }
      },4000);
    }
  }
//MensajePerso