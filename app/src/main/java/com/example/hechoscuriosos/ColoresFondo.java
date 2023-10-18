package com.example.hechoscuriosos;

import android.graphics.Color;

import java.util.Random;

public class ColoresFondo {
    Random randomGenerator = new Random();
    String[] colores =
            {
                    "#39add1", // light blue
                    "#0000ff", // pure blue
                    "#c25975", // mauve
                    "#ff0000", // pure red
                    "#f9845b", // orange
                    "#838cc7", // lavender
                    "#7d669e", // purple
                    "#53bbb4", // aqua
                    "#00ff00", // pure green
                    "#e0ab18", // mustard
                    "#637a91", // dark gray
                    "#f092b0", // pink
                    "#b7c0c7", // light gray
                    "#7a2021" //garnet
            };

    public int getColorAleatorio() {
        //Seleccionar un color aleatorio

        int randomNumber = randomGenerator.nextInt(colores.length);
        //devuelve un String con un colores Aleatorio
        return Color.parseColor(colores[randomNumber]);
    }

    public int getColor1() {
        return Color.parseColor(colores[13]);
    }

    int numeros = 0;
    int numerop = numeros;


    public int getColor2() {
        String[] colores2 = {
                "#0000ff", // pure blue
                "#ff0000", // pure red
                "#00ff00" // pure green
        };
        // Genera tres números aleatorios
        do {
            numerop = randomGenerator.nextInt(3);

        } while (numeros == numerop);
        numeros = numerop;
        // Si son iguales al anterior, genera números aleatorios nuevos


        return Color.parseColor(colores2[numerop]);
    }
}

