package com.company;

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
