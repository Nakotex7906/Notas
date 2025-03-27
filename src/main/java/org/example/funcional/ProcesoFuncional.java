package org.example.funcional;


import java.util.Arrays;

public class ProcesoFuncional {

    // Metodo funcional
    public static int[] analizarNotasFuncional(double[] notas) {
        long mayoresA4 = Arrays.stream(notas).filter(n -> n > 4.0).count();
        long menoresA36 = Arrays.stream(notas).filter(n -> n < 3.6).count();
        long entre36y4 = Arrays.stream(notas).filter(n -> n >= 3.6 && n <= 4.0).count();

        return new int[]{(int) mayoresA4, (int) menoresA36, (int) entre36y4};
    }
}

