package com.mycompany.service;

import com.mycompany.STATS.ResultadoOrdenamiento;
import java.util.ArrayList;
import java.util.List;

public class GestorResultados {


    private List<ResultadoOrdenamiento> resultados;


    public GestorResultados(){

        resultados = new ArrayList<>();

    }


    public void agregarResultado(ResultadoOrdenamiento resultado){

        resultados.add(resultado);

    }


    public List<ResultadoOrdenamiento> obtenerResultados(){

        return new ArrayList<>(resultados);

    }


    public void limpiarResultados(){

        resultados.clear();

    }

}