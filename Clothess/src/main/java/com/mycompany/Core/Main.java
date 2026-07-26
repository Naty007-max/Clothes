package com.mycompany.Core;

import com.mycompany.STATS.ResultadoOrdenamiento;
import com.mycompany.models.PrendaDeVestir;
import com.mycompany.service.GestorDatos;
import com.mycompany.sorting.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //hola
    public static void main(String[] args) {

        // Crear el gestor
        GestorDatos gestor = new GestorDatos();
        List<PrendaDeVestir> prendas = new ArrayList<>();
        prendas.add(new PrendaDeVestir(1, "Camisa", "...", "...", "...", 10, 90000));
        prendas.add(new PrendaDeVestir(2, "Pantalón", "...", "...", "...", 5, 30000));
        prendas.add(new PrendaDeVestir(3, "Chaqueta", "...", "...", "...", 8, 70000));
        prendas.add(new PrendaDeVestir(4, "Gorra", "...", "...", "...", 12, 20000));
        // Crear algunas prendas
        PrendaDeVestir prenda1 = new PrendaDeVestir(
                1,
                "Camiseta",
                "Superior",
                "M",
                "Nike",
                20,
                95000
        );

        PrendaDeVestir prenda2 = new PrendaDeVestir(
                2,
                "Jean",
                "Inferior",
                "32",
                "Levis",
                15,
                180000
        );

        // Agregarlas al gestor
        gestor.agregarPrenda(prenda1);
        gestor.agregarPrenda(prenda2);

        // Mostrar todas las prendas
        System.out.println("=== LISTA DE PRENDAS ===");
        for (PrendaDeVestir prenda : gestor.obtenerPrendas()) {
            System.out.println(prenda);
        }
       QuickSort se = new QuickSort ();

        ResultadoOrdenamiento resultado = se.ordenar(prendas);

        for (PrendaDeVestir p : resultado.getPrendasOrdenadas()) {
            System.out.println(p.getPrecio());
        }

        System.out.println("Comparaciones: " + resultado.getComparaciones());
        System.out.println("Intercambios: " + resultado.getIntercambios());
        System.out.println("Tiempo: " + resultado.getTiempoEjecucion() + " S");
        System.out.println("Algoritmo: " +resultado.getNombreAlgoritmo());
    }
}

