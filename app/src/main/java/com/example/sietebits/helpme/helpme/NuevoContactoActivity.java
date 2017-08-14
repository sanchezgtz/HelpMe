package com.example.sietebits.helpme.helpme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class NuevoContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_contacto);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_alta_contacto, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_alta:
                guardarContacto();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void guardarContacto() {
        Toast.makeText(this, "Prueba: el contacto se guardó correctamente", Toast.LENGTH_SHORT).show();
    }

}
