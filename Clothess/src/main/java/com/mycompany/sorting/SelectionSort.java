package com.mycompany.sorting;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements  AlgoritmoOrdenamiento{
    @Override
    public ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas){
        List <PrendaDeVestir> copia = new ArrayList<>(prendas);

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
            if (indicemenor != i){
                PrendaDeVestir aux = copia.get(i);
                copia.set(i,copia.get(indicemenor));
                copia.set(indicemenor,aux);
                intercambios++;
            }

        }
        long fin = System.nanoTime();
        return new ResultadoOrdenamiento(
                "Selection Sort",
                fin - inicio,
                comparaciones,
                intercambios,
                copia
        );}


}
