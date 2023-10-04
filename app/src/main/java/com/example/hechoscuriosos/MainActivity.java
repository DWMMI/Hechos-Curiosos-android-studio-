package com.example.hechoscuriosos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextSelection;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClic (View view){
        int valorAleatorio = (int) Math.floor(Math.random()*10);
        String [] curiosidades = new String[10];
        curiosidades [0]="Hidrógeno (H):Es el elemento más abundante en el universo, constituyendo aproximadamente el 75% de su masa. Se utiliza en cohetes espaciales y es la fuente de energía en las reacciones de fusión nuclear.";
        curiosidades [1]="Oxígeno (O):Es esencial para la respiración aeróbica en la mayoría de los seres vivos.A pesar de ser necesario para la vida, es altamente reactivo y puede causar corrosión.";
        curiosidades [2]="Carbono (C):Es la base de la química orgánica y forma la columna vertebral de las moléculas biológicas, como el ADN y las proteínas.Tiene varias formas alotrópicas, incluyendo el diamante y el grafito.";
        curiosidades [3]="Hierro (Fe):Es uno de los metales más abundantes en la Tierra y es fundamental en la fabricación de acero.La hemoglobina, que transporta oxígeno en la sangre, contiene hierro.";
        curiosidades [4]="Neón (Ne):Se utiliza en letreros de neón debido a su brillante luz roja cuando se excita eléctricamente.Es un gas noble y no reacciona fácilmente con otros elementos.";
        curiosidades [5]="Calcio (Ca):Es esencial para la formación de huesos y dientes en seres humanos y otros animales.También se utiliza en la fabricación de cemento y en la industria alimentaria.";
        curiosidades [6]="Cobre (Cu):Es un excelente conductor de electricidad y se utiliza comúnmente en cables y alambres eléctricos.Tiene propiedades antibacterianas y se utiliza en superficies de contacto en hospitales.";
        curiosidades [7]="Plata (Ag):Es un metal precioso conocido por su brillo y valor histórico como moneda.Tiene propiedades antibacterianas y se utiliza en aplicaciones médicas y de higiene.";
        curiosidades [8]="Yodo (I):Es un elemento esencial para el funcionamiento de la glándula tiroides en el cuerpo humano.A menudo se utiliza en desinfectantes y tinturas de piel.";
        curiosidades [9]="Uranio (U):Se utiliza como combustible en reactores nucleares para producir energía eléctrica.Tiene isótopos que son inestables y se desintegran radiactivamente, lo que lo hace importante en la datación por radiocarbono.";

        TextView modificar = findViewById(R.id.textView9);
        modificar.setText(curiosidades[valorAleatorio]);
    }
}