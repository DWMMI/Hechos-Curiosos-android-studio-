package com.example.hechoscuriosos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ListaHechos listaHechos = new ListaHechos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClic (View view){

        TextView modificar = findViewById(R.id.textView9);
        modificar.setText(listaHechos.getHechoAleatorio());
        cambiarColorDeFondo();
    }
    private void cambiarColorDeFondo() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        int color = Color.rgb(red, green, blue);
        View view = getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}