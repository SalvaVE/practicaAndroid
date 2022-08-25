package com.gagv.actividadpractica;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ejercicio1 extends AppCompatActivity {
    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        et1=(EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editTex1);
        et3 = (EditText) findViewById(R.id.editTex2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.Ejercicioonclick){
            finish();
            Intent ejercicioonclick = new Intent(this, MainActivity.class);
            startActivity(ejercicioonclick);
        }else if (id == R.id.Ejercicio1){
            finish();
            Intent ejercicio1 = new Intent(this, ejercicio1.class);
            startActivity(ejercicio1);
        }
        return super.onOptionsItemSelected(item);
    }
 public void ingresar (View v){
String nombre= et1.getText().toString();
String salario=et2.getText().toString();
double renta = 0.10;
    salario = salario * renta;
     Toast.makeText(this, "El nombre es: " + nombre + "El salario es: " + salario + "El salario con rentecion de la renta es: " + salario, Toast.LENGTH_SHORT).show();

 }
}
