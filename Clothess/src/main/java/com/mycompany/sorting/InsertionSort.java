package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements  AlgoritmoOrdenamiento{
    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas){
        List <PrendaDeVestir> copia = new ArrayList<>(prendas);// copiamos la lista original

        int comparaciones = 0;
        int intercambios = 0;

        long inicio = System.nanoTime();

        for (int i = 1; i < copia.size() ; i++){//iniciamos desde el primer numero
            PrendaDeVestir clave = copia.get(i);
            int j = i - 1; //variable para ir recorriendo hacia atras

            while (j >= 0 ){
                comparaciones++;
                if (copia.get(j).getPrecio() > clave.getPrecio()) {

                    copia.set(j + 1, copia.get(j));

                    j--;//revisamo si atras hay numeros mayores a la clave
                }
                else {
                    break;
                }

            }
            copia.set(j + 1, clave);//insertamos el numero donde va
            intercambios++;

            }



        long fin = System.nanoTime();
        double tiempo = (fin - inicio) / 1_000_000_000D;
        return new ResultadoOrdenamiento(
                "Insertion Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia);
    }
}
