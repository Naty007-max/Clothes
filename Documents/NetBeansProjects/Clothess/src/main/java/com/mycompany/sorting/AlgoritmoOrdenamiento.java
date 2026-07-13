package com.mycompany.sorting;

import java.util.List;
import com.mycompany.models.PrendaDeVestir;
import com.mycompany.STATS.ResultadoOrdenamiento;

public interface AlgoritmoOrdenamiento {

    ResultadoOrdenamiento ordenar(List<PrendaDeVestir> prendas);

}