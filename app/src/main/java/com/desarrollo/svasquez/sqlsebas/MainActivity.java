package com.desarrollo.svasquez.sqlsebas;

import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inicializar();

    }

    private void inicializar(){
        try {
            DBManager dbManager= new DBManager(this);
            Toast.makeText(this,"Correcto",Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();
        }

    }

    public void guardarAprendis(){

    }
}
