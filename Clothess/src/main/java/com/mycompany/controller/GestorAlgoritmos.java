package com.mycompany.controller;

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

    public List<ResultadoOrdenamiento> ejecutarTodos(List<PrendaDeVestir> prendas) {

        List<ResultadoOrdenamiento> resultados = new ArrayList<>();

        for (AlgoritmoOrdenamiento algoritmo : algoritmos) {
            resultados.add(algoritmo.ordenar(prendas));
        }

        return resultados;
    }

    public List<AlgoritmoOrdenamiento> obtenerAlgoritmos() {
        return algoritmos;
    }

}