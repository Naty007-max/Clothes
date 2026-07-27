package com.mycompany.STATS;

import java.util.ArrayList;
import java.util.List;

public class AnalizadorResultados {



// ORDENAMOS por tiempo
    public List<ResultadoOrdenamiento> ordenarMinTiempo(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r1.getTiempoEjecucion(),
                        r2.getTiempoEjecucion()
                )
        );

        return copia;
    }


    public List<ResultadoOrdenamiento> ordenarMaxTiempo(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r2.getTiempoEjecucion(),
                        r1.getTiempoEjecucion()
                )
        );

        return copia;
    }


    //Ordenar por intercambios
    public List<ResultadoOrdenamiento> ordenarMinIntercambios(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r1.getIntercambios(),
                        r2.getIntercambios()
                )
        );

        return copia;
    }

    public List<ResultadoOrdenamiento> ordenarMaxIntercambios(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r2.getIntercambios(),
                        r1.getIntercambios()
                )
        );

        return copia;
    }


    public List<ResultadoOrdenamiento> ordenarMinComparacion(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r1.getComparaciones(),
                        r2.getComparaciones()
                )
        );

        return copia;
    }

    public List<ResultadoOrdenamiento> ordenarMaxComparacion(
            List<ResultadoOrdenamiento> resultados) {

        List<ResultadoOrdenamiento> copia =
                new ArrayList<>(resultados);

        copia.sort((r1, r2) ->
                Double.compare(
                        r2.getComparaciones(),
                        r1.getComparaciones()
                )
        );

        return copia;
    }
}

