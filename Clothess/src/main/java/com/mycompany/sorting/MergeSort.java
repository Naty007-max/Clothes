package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements AlgoritmoOrdenamiento {

    private int comparaciones;
    private int intercambios;

    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas) {

        List<PrendaDeVestir> copia = new ArrayList<>(prendas);

        comparaciones = 0;
        intercambios = 0;

        long inicio = System.nanoTime();

        mergeSort(copia, 0, copia.size() - 1);

        long fin = System.nanoTime();

        double tiempo = (fin - inicio) / 1_000_000D;

        return new ResultadoOrdenamiento(
                "Merge Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia
        );
    }

    private void mergeSort(List<PrendaDeVestir> lista, int comienzo, int fin) {

        if (comienzo >= fin) {
            return;
        }

        int medio = (comienzo + fin) / 2;

        mergeSort(lista, comienzo, medio);
        mergeSort(lista, medio + 1, fin);

        merge(lista, comienzo, medio, fin);
    }

    private void merge(List<PrendaDeVestir> lista, int comienzo, int medio, int fin) {

        List<PrendaDeVestir> temp = new ArrayList<>();

        int i = comienzo;
        int j = medio + 1;

        while (i <= medio && j <= fin) {

            comparaciones++;

            if (lista.get(i).getPrecio() <= lista.get(j).getPrecio()) {
                temp.add(lista.get(i));
                i++;
            } else {
                temp.add(lista.get(j));
                j++;
            }
        }

        while (i <= medio) {
            temp.add(lista.get(i));
            i++;
        }

        while (j <= fin) {
            temp.add(lista.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            lista.set(comienzo + k, temp.get(k));
        }
    }
}