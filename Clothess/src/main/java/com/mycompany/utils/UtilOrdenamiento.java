

package com.mycompany.utils;

import java.util.List;
import com.mycompany.models.PrendaDeVestir;

public class UtilOrdenamiento {

    private UtilOrdenamiento() {
        // Evita que se creen objetos de esta clase.
    }

    public static void intercambiar(List<PrendaDeVestir> lista, int i, int j) {

        PrendaDeVestir aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);

    }
}