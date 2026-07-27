package com.mycompany.Core;

import com.mycompany.STATS.AnalizadorResultados;
import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;
import com.mycompany.service.GestorDatos;
import com.mycompany.sorting.*;
import com.mycompany.view.NewJPanel;

import java.util.ArrayList;
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
        // Simulamos resultados de algoritmos
        List<ResultadoOrdenamiento> resultados = new ArrayList<>();

        resultados.add(new ResultadoOrdenamiento(
                "Bubble Sort",
                0.080,
                1000,
                500,
                null
        ));

        resultados.add(new ResultadoOrdenamiento(
                "Selection Sort",
                0.050,
                900,
                200,
                null
        ));

        resultados.add(new ResultadoOrdenamiento(
                "Merge Sort",
                0.004,
                300,
                100,
                null
        ));

        resultados.add(new ResultadoOrdenamiento(
                "Quick Sort",
                0.002,
                250,
                80,
                null
        ));

        resultados.add(new ResultadoOrdenamiento(
                "Heap Sort",
                0.006,
                400,
                120,
                null
        ));


        AnalizadorResultados analizador = new AnalizadorResultados();




        // ==========================
        // PRUEBA 2: Orden menor a mayor
        // ==========================

        List<ResultadoOrdenamiento> menorMayor =
                analizador.ordenarMinTiempo(resultados);


        System.out.println("\n===== MENOR A MAYOR =====");

        for(ResultadoOrdenamiento resultado : menorMayor){

            System.out.println(
                    resultado.getNombreAlgoritmo()
                            + " : "
                            + resultado.getTiempoEjecucion()
            );

        }


        // ==========================
        // PRUEBA 3: Orden mayor a menor
        // ==========================

        List<ResultadoOrdenamiento> mayorMenor =
                analizador.ordenarMaxTiempo(resultados);


        System.out.println("\n===== MAYOR A MENOR =====");

        for(ResultadoOrdenamiento resultado : mayorMenor){

            System.out.println(
                    resultado.getNombreAlgoritmo()
                            + " : "
                            + resultado.getTiempoEjecucion()
            );

        }

    }
}

