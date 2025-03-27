package org.example.imperativo;

public class MainImperativo {

    public static void main(String[] args) {
    int cantidadNotas = 10;

    //Generar notas aleatorias
    double [] notas = GeneracionDatosImperativo.generarNotas(cantidadNotas);

    //Procesar enfoque imperativo
        int[] resultadosImperativo = ProcesoImperativo.analizarNotasImperativo(notas);
        //Mostrar resultados
        SalidaDatosImperativo.mostrarResultados(notas,resultadosImperativo);
    }
}
