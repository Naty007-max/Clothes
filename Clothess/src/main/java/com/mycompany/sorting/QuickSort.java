package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements AlgoritmoOrdenamiento {

    private int comparaciones = 0;
    private int intercambios = 0;

    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas) {

        List<PrendaDeVestir> copia = new ArrayList<>(prendas);
        comparaciones = 0;
        intercambios = 0;

        long inicio = System.nanoTime();
        quickSort(copia, 0, copia.size() - 1);

        long fin = System.nanoTime();

        double tiempo = (fin - inicio) / 1_000_000D;

        return new ResultadoOrdenamiento(
                "Quick Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia);
    }
    private  void quickSort(List<PrendaDeVestir> lista, int inicio,int ultimo ){

        if (inicio >= ultimo) {
            return;
        }

        int pivote = partition(lista, inicio, ultimo);

        quickSort(lista, inicio, pivote - 1);

        quickSort(lista, pivote + 1, ultimo);
    }

    private int partition(List<PrendaDeVestir> lista, int inicio, int ultimo) {

        PrendaDeVestir pivote = lista.get(ultimo);

        int i = inicio - 1;

        for (int j = inicio; j < ultimo; j++) {

            comparaciones++;

            if (lista.get(j).getPrecio() <= pivote.getPrecio()) {

                i++;
                PrendaDeVestir temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);

                intercambios++;

            }




    }
        PrendaDeVestir temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(ultimo));
        lista.set(ultimo, temp);

        intercambios++;

        return i +1;
    }
}
