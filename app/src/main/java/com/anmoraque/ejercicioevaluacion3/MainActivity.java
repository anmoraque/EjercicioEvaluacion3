package com.anmoraque.ejercicioevaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.anmoraque.ejercicioevaluacion3.util.UtilRed;

public class MainActivity extends AppCompatActivity {

    private TextView chiste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO DEBERIAMOS CONTROLAR QUE HAY ACCESO A ITERNET
        //si hay internet, pido la canción
        if (UtilRed.hayInternetViejo(this))
        {
            Log.d("ETIQUETA_LOG", "Hay internet");

            RecuperaChisteChuck recuperaChisteChuck = new RecuperaChisteChuck(this);
            recuperaChisteChuck.execute();
        }
        else {
            Log.d("ETIQUETA_LOG", "NO Hay internet");
            Toast.makeText(this, "SIN CONEXIÓN A INTERNET", Toast.LENGTH_LONG).show();
        }
        //si no, mostramos un mensaje TOAST informativo

    }

    public void mostrarChisteRecibido(InfoChisteChuck infoChisteChuck)
    {
        Log.d("ETIQUETA_LOG" ,"Chiste rx = " + infoChisteChuck.toString());
        this.chiste = findViewById(R.id.chiste);


        this.chiste.setText(infoChisteChuck.getValue().toString());

    }
}