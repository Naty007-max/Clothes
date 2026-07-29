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

        for (int i = 0;i< prendas.size() -1;i++){

            boolean huboIntercambio = false; //asumimos de que no se ha cambiado nada

            for (int j = 0; j < prendas.size() - 1; j++){
            comparaciones++;

                if (prendas.get(j).getPrecio() > prendas.get(j + 1).getPrecio()){// si hay una prenda por intercambiar

                    PrendaDeVestir aux = prendas.get(j);
                    prendas.set(j,prendas.get(j +1));
                    prendas.set(j +1, aux); //intercambiamo
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
                prendas
        );
    }
}