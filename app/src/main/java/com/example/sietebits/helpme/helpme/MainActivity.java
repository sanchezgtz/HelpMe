package com.example.sietebits.helpme.helpme;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fabNuevo);
        fab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NuevoContactoActivity.class);
                startActivity(i);
            }
        });

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvContactos);
        rv.setLayoutManager(new LinearLayoutManager(this));
            rv.setAdapter(new ContactoAdapter(new String[] {"Contacto 1", "Contacto 2", "Contacto 3", "Contacto 4", "Contacto 5", "Contacto 6", "Contacto 7"}));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_contactos:
                Intent i = new Intent(this, ContactosActivity.class);
                startActivity(i);
                return true;
            case R.id.nav_acercade:
                i = new Intent(this, AcercaDeActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
