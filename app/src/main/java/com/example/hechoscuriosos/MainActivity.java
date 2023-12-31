package com.example.hechoscuriosos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
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
        ConstraintLayout modColor = findViewById(R.id.backgroudid);
        mostrarHecho(modificar);
        coloresFondo();
        //cambiarColorDeFondo();
    }

    //diferentes onBtnClic, este es el segundo botón
    public void onBtnClic1(View view) {
        TextView modificar1 = findViewById(R.id.textView9);
        View modColor = findViewById(R.id.backgroudid);
        mostrarHecho1(modificar1);
        coloresFondo1();
    }

    //Método onClic del botón 2
    public void onBtnClic2(View view) {
        TextView modificar2 = findViewById(R.id.textView9);
        View modColor = findViewById(R.id.backgroudid);
        mostrarHecho2(modificar2);
        coloresFondo2();
    }

    public void onBtnClic3(View view) {
        TextView modificar3 = findViewById(R.id.textView9);
        ConstraintLayout modColor = findViewById(R.id.backgroudid);
        //todo
        mostrarHecho3(modificar3);
        coloresFondo();
    }

    public void mostrarHecho(TextView modificar) {
        modificar.setText(listaHechos.getHechoAleatorio());
    }

    public void mostrarHecho1(TextView modificar1) {
        modificar1.setText(listaHechos.getHecho1());
    }

    public void mostrarHecho2(TextView modificar2) {
        modificar2.setText(listaHechos.getHecho2());
    }

    public void mostrarHecho3(TextView modificar3) {
        modificar3.setText(listaHechos.getHecho3());
    }

    public void coloresFondo() {
        int color = coloresFondo.getColorAleatorio();
        View view = getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void coloresFondo1() {
        int color = coloresFondo.getColor1();
        View view = getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void coloresFondo2() {
        int color = coloresFondo.getColor2();
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