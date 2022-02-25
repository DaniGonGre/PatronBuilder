package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import static com.company.Pizzas.INTEGRAL;
import static java.awt.Frame.NORMAL;

public class Main {

    public static void main(String[] args) {

        Pizzas miPizza;

        //Forma corta
        Pizzas miNuevaPizza = new Builder()
                .setMasa(NORMAL)
                .setRelleno(true)
                .build();

        System.out.println(miNuevaPizza.toString());

        Pizzas miNuevaPizza2 = new Builder()
                .setMasa(NORMAL)
                .setRelleno(false)
                .setTipo(2)
                .cebolla(false)
                .setChampiñones(true)
                .setJamon(true)
                .build();

        System.out.println(miNuevaPizza2.toString());

        /* Forma larga

        // Instaciamos el Builder
        Builder miBuilder = new Builder();

        Builder miBuilder2 = miBuilder.setMasa(NORMAL);
        Builder miBuilder3 = miBuilder.setRelleno(true);

        // Construimos la pizza
        miPizza = miBuilder.build();
        System.out.println(miPizza.toString());*/
    }
}
