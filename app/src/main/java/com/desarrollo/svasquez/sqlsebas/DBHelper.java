package com.desarrollo.svasquez.sqlsebas;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by svasquez on 31/10/2015.
 */
public class DBHelper extends SQLiteOpenHelper {


    public final static String DB_NAME="sena"; //nombre de la base de datos
    public final static int DB_VERSION=1;


    /**
     * constructor
     * @param context
     */
    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    /**
     * crae la base de datos
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBManager.CREAR_TABLA);
    }


    /**
     * nos actualiza la base de datos le decimos cual esla nueva y que vesion nueva es
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
