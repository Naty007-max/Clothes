package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class HeapSort implements AlgoritmoOrdenamiento {

    private int comparaciones;
    private int intercambios;

    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas) {

        List<PrendaDeVestir> copia = new ArrayList<>(prendas);

        comparaciones = 0;
        intercambios = 0;

        long inicio = System.nanoTime();

        heapSort(copia);

        long fin = System.nanoTime();

        double tiempo = (fin - inicio) / 1_000_000_000D;

        return new ResultadoOrdenamiento(
                "Heap Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia
        );
    }

    private void heapSort(List<PrendaDeVestir> lista) {

        int n = lista.size();

        // Construir el Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(lista, n, i);
        }

        // Extraer elementos uno a uno
        for (int i = n - 1; i > 0; i--) {

            intercambios++;

            PrendaDeVestir temp = lista.get(0);
            lista.set(0, lista.get(i));
            lista.set(i, temp);

            heapify(lista, i, 0);
        }
    }

    private void heapify(List<PrendaDeVestir> lista, int n, int i) {

        int mayor = i;
        int izquierda = 2 * i + 1;
        int derecha = 2 * i + 2;

        if (izquierda < n) {

            comparaciones++;

            if (lista.get(izquierda).getPrecio() >
                    lista.get(mayor).getPrecio()) {

                mayor = izquierda;
            }
        }

        if (derecha < n) {

            comparaciones++;

            if (lista.get(derecha).getPrecio() >
                    lista.get(mayor).getPrecio()) {

                mayor = derecha;
            }
        }

        if (mayor != i) {

            intercambios++;

            PrendaDeVestir temp = lista.get(i);
            lista.set(i, lista.get(mayor));
            lista.set(mayor, temp);

            heapify(lista, n, mayor);
        }
    }
}