package com.example.hechoscuriosos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.TintableBackgroundView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListaHechos listaHechos = new ListaHechos();
    ColoresFondo coloresFondo = new ColoresFondo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClic(View view) {
        TextView modificar = findViewById(R.id.textView9);
        View modColor = findViewById(R.id.backgroudid);
        mostrarHecho(modificar);
        coloresFondo();
        //cambiarColorDeFondo();
    }

    //diferentes onBtnClic
    public void onBtnClic1(View view) {
        System.out.println("boton 1");
    }

    public void mostrarHecho(TextView modificar) {
        modificar.setText(listaHechos.getHechoAleatorio());
    }
    public void coloresFondo() {
        int color = coloresFondo.getColorAleatorio();
        View view = getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

//    private void cambiarColorDeFondo() {
//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//      int blue = random.nextInt(256);
//        int color = Color.rgb(red, green, blue);
//        View view = getWindow().getDecorView();
//        view.setBackgroundColor(color);
//    }
}