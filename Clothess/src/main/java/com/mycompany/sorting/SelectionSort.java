package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements  AlgoritmoOrdenamiento{
    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas){
        List <PrendaDeVestir> copia = new ArrayList<>(prendas);// copiamos la lista original

        int comparaciones = 0;
        int intercambios = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < copia.size() -1; i++){

            int indicemenor = i; //asumimos que el menor es i

            for (int j = i+1; j < copia.size(); j++){
                comparaciones++;
                if(copia.get(j).getPrecio() < copia.get(indicemenor).getPrecio()){

                    indicemenor = j;


                    }
            }
            if (indicemenor != i){// aqui vemos si el dato menor no es el que ya asumimos
                PrendaDeVestir aux = copia.get(i);
                copia.set(i,copia.get(indicemenor));//intercambio
                copia.set(indicemenor,aux);
                intercambios++;//aumentamos el numero de intercambios
            }

        }
        long fin = System.nanoTime();
        double tiempo = fin - inicio/1_000_000_000D;
        return new ResultadoOrdenamiento(
                "Selection Sort",
                tiempo,
                comparaciones,
                intercambios,
                copia
        );}


}
