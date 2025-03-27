package org.example.imperativo;

public class ProcesoImperativo {
    // Metodo imperativo
    public static int[] analizarNotasImperativo(double[] notas) {
        int mayoresA4 = 0, menoresA36 = 0, entre36y4 = 0;

        for (double nota : notas) {
            if (nota > 4.0) {
                mayoresA4++;

            } else if (nota < 3.6) {
                menoresA36++;
            } else if (nota >= 3.6 && nota <= 4.0) {
                entre36y4++;
            }
        }
        return new int[]{mayoresA4, menoresA36, entre36y4};
    }
}
