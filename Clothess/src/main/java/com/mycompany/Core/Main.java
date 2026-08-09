package com.mycompany.Core;

import com.mycompany.STATS.AnalizadorResultados;
import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.service.GenPrendas;
import com.mycompany.service.GestorAlgoritmos;
import com.mycompany.service.GestorDatos;
import com.mycompany.service.GestorResultados;
import com.mycompany.sorting.*;
import com.mycompany.view.NewJPanel;

import java.util.List;
import javax.swing.JFrame;

public class Main {

    //hola
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
        JFrame ventana = new JFrame("ClothesSort");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(new NewJPanel());
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    });

        // ==========================
        // 1. Crear datos
        // ==========================

        GestorDatos gestorDatos = new GestorDatos();

        GenPrendas generador = new GenPrendas();

        generador.generarPrendas(100, gestorDatos);



        // ==========================
        // 2. Crear gestores
        // ==========================

        GestorAlgoritmos gestorAlgoritmos =
                new GestorAlgoritmos();


        GestorResultados gestorResultados =
                new GestorResultados();



        AnalizadorResultados analizador =
                new AnalizadorResultados();



        // ==========================
        // 3. Registrar algoritmos
        // ==========================

        QuickSort quick = new QuickSort();
        MergeSort merge = new MergeSort();
        HeapSort heap = new HeapSort();



        // ==========================
        // 4. Ejecutar algoritmos
        // ==========================

        ResultadoOrdenamiento resultadoQuick =
                gestorAlgoritmos.ejecutar(
                        quick,
                        gestorDatos.obtenerPrendas()
                );


        ResultadoOrdenamiento resultadoMerge =
                gestorAlgoritmos.ejecutar(
                        merge,
                        gestorDatos.obtenerPrendas()
                );


        ResultadoOrdenamiento resultadoHeap =
                gestorAlgoritmos.ejecutar(
                        heap,
                        gestorDatos.obtenerPrendas()
                );



        // ==========================
        // 5. Guardar resultados
        // ==========================

        gestorResultados.agregarResultado(resultadoQuick);

        gestorResultados.agregarResultado(resultadoMerge);

        gestorResultados.agregarResultado(resultadoHeap);



        // ==========================
        // 6. Obtener resultados
        // ==========================

        List<ResultadoOrdenamiento> resultados =
                gestorResultados.obtenerResultados();



        // ==========================
        // 7. Analizar resultados
        // ==========================

        List<ResultadoOrdenamiento> ordenados =
                analizador.ordenarMinTiempo(resultados);



        // ==========================
        // 8. Mostrar
        // ==========================

        System.out.println("===== RESULTADOS =====");


        for(ResultadoOrdenamiento resultado : ordenados){


            System.out.println(
                    "Algoritmo: "
                            + resultado.getNombreAlgoritmo()
            );


            System.out.println(
                    "Tiempo: "
                            + resultado.getTiempoEjecucion()
                            + " segundos"
            );


            System.out.println(
                    "Comparaciones: "
                            + resultado.getComparaciones()
            );


            System.out.println(
                    "Intercambios: "
                            + resultado.getIntercambios()
            );


            System.out.println("---------------------");

        }

    }

}

