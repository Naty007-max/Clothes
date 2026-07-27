package com.mycompany.service;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.sorting.AlgoritmoOrdenamiento;
import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;

public class GestorAlgoritmos {

    private List<AlgoritmoOrdenamiento> algoritmos;

    public GestorAlgoritmos() {
        algoritmos = new ArrayList<>();
    }

    public void registrarAlgoritmo(AlgoritmoOrdenamiento algoritmo) {
        algoritmos.add(algoritmo);
    }

    public ResultadoOrdenamiento ejecutar(
            AlgoritmoOrdenamiento algoritmo,
            List<PrendaDeVestir> prendas
    )
    {
        return algoritmo.ordenar(prendas);
    }

    public List<AlgoritmoOrdenamiento> obtenerAlgoritmos() {
        return new ArrayList<>(algoritmos);
    }

}