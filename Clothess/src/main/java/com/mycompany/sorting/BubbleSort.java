package com.mycompany.sorting;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.models.PrendaDeVestir;
import com.mycompany.STATS.ResultadoOrdenamiento;


public class BubbleSort implements AlgoritmoOrdenamiento {

    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas) {

        List<PrendaDeVestir> copia = new ArrayList<>(prendas);

        int comparaciones = 0;
        int intercambios = 0;

        long inicio = System.nanoTime();

        for (int i = 0;i< copia.size() -1;i++){

            boolean huboIntercambio = false; //asumimos de que no se ha cambiado nada

            for (int j = 0; j < copia.size() - 1; j++){
                comparaciones++;

                if (copia.get(j).getPrecio() > copia.get(j + 1).getPrecio()){// si hay una prenda por intercambiar

                    PrendaDeVestir aux = copia.get(j);
                    copia.set(j,copia.get(j +1));
                    copia.set(j +1, aux); //intercambiamo
                    intercambios++;
                    huboIntercambio = true;// ya sabemo que hubo cambio
                }


            }
            if (!huboIntercambio){// si no se intercambio lo paramos en seco
                break;
            }
        }

        long fin = System.nanoTime();
        double tiempo = (fin - inicio) / 1_000_000D;
        return new ResultadoOrdenamiento(
                "Bubble Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia
        );
    }
}