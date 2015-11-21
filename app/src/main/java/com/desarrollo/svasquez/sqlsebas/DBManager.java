package com.desarrollo.svasquez.sqlsebas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by svasquez on 31/10/2015.
 */
public class DBManager {

    public static final String TABLE_NAME="aprencidces";
    public static final String CN_id="id";
    public static final String CN_NOMBRE="nombre";
    public static final String CN_APELLIDO="apellido";
    public static final String CN_DIRECCION="direccion";
    public static final String CN_EDAD="edad";


    /*
    create table contactos(
    id integer primary key autoincrement,
    nombre text not null,
    telefono text )

            */

    public static final String CREAR_TABLA ="create table "+TABLE_NAME+" (" +
            CN_id+" integer primary key autoincrement, " +
            CN_NOMBRE+" text not null, " +
            CN_APELLIDO+" text not null, " +
            CN_DIRECCION+" text, " +
            CN_EDAD+" text );";

    private DBHelper helper;
    private SQLiteDatabase db;

    public DBManager(Context context){
        helper = new DBHelper(context);
        db= helper.getWritableDatabase();
    }

    public void insertar(String nombre, String apellido, String direccion, String edad){
        ContentValues values = new ContentValues();
        values.put(CN_NOMBRE, nombre);
        values.put(CN_APELLIDO, apellido);
        values.put(CN_DIRECCION, direccion);
        values.put(CN_EDAD, edad);
        db.insert(TABLE_NAME, null,values);

    }

}
