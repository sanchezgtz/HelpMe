package com.example.sietebits.helpme.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ContactosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvContactosAgenda);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ContactoAdapter(new String[] {"Contacto 1", "Contacto 2", "Contacto 3", "Contacto 4", "Contacto 5", "Contacto 6", "Contacto 7"}));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_busqueda, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_busqueda:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
