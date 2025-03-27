package org.example.funcional;
public class MainFuncional {
    public static void main(String[] args) {

        int cantidadNotas = 10;

        //Generar notas aleatorias
        double [] notas = GeneracionDatosFuncional.generarNotas(cantidadNotas);
        //Procesar enfoque funcional
        int[] resultadosFuncional = ProcesoFuncional.analizarNotasFuncional(notas);
        //Mostrar resultados
        SalidaDatosFuncional.mostrarResultados(notas,resultadosFuncional);
    }
}