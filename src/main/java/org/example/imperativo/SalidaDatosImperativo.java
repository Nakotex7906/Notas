package org.example.imperativo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SalidaDatosImperativo {
    public static void mostrarResultados(double[] notas, int[] resultadosImperativo) {
        //Formatear los numeros a un decimal
        DecimalFormat df = new DecimalFormat("#.0");
        String notasFormarteadas = Arrays.stream(notas)
                .mapToObj(df::format)
                .collect(Collectors.joining(" / "));

        // Mostrar notas generadas
        System.out.println(" Notas generadas:");
        System.out.println("[" + notasFormarteadas + "]");
        // Mostrar resultados enfoque imperativo
        System.out.println("\n Enfoque Imperativo:");
        System.out.println("Notas mayores a 4.0: " + resultadosImperativo[0]);
        System.out.println("Notas menores a 3.6: " + resultadosImperativo[1]);
        System.out.println("Notas entre 3.6 y 4.0: " + resultadosImperativo[2]);
    }
    }
