package org.example.imperativo;

import java.util.Random;

public class GeneracionDatosImperativo {

    public static double[] generarNotas(int cantidad) {
        Random rand = new Random();
        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            notas[i] = 1.0 + rand.nextDouble() * (7.0 - 1.0); // Genera entre 1.0 y 7.0
        }
        return notas;
    }
}
