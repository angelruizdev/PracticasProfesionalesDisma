package com.example.angelruiz.disma;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Felis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.felis);

    }
}
