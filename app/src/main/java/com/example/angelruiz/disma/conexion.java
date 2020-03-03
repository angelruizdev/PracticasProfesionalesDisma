package com.example.angelruiz.disma;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class conexion extends SQLiteOpenHelper {
    public conexion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("CREATE TABLE USUARIOS(usuario text, correo varchar, contrasena varchar)");
     db.execSQL("INSERT INTO USUARIOS VALUES('angel','angel@gmail.com','123')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("CREATE TABLE USUARIOS(usuario text, correo varchar, contrasena varchar)");
        db.execSQL("INSERT INTO USUARIOS VALUES('angel','angel@gmail.com','123')");
    }
}
