package com.mycompany.sorting;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.models.PrendaDeVestir;
import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.utils.UtilOrdenamiento;

public class BubbleSort implements AlgoritmoOrdenamiento {

    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas) {

        List<PrendaDeVestir> lista = new ArrayList<>(prendas);

        int comparaciones = 0;
        int intercambios = 0;

        long inicio = System.nanoTime();

        // Aquí irá el algoritmo

        long fin = System.nanoTime();

        return new ResultadoOrdenamiento(
                "Bubble Sort",
                fin - inicio,
                comparaciones,
                intercambios,
                lista
        );
    }
}