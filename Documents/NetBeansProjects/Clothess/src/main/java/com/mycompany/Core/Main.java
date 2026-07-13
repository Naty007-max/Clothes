package com.mycompany.Core;

import com.mycompany.models.PrendaDeVestir;
import com.mycompany.service.GestorDatos;

public class Main {

    public static void main(String[] args) {

        // Crear el gestor
        GestorDatos gestor = new GestorDatos();

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

        // Buscar una prenda
        System.out.println("\n=== BUSCAR CÓDIGO 2 ===");
        PrendaDeVestir encontrada = gestor.buscarPrenda(2);

        if (encontrada != null) {
            System.out.println(encontrada);
        } else {
            System.out.println("Prenda no encontrada.");
        }

        // Eliminar una prenda
        System.out.println("\n=== ELIMINAR CÓDIGO 1 ===");

        if (gestor.eliminarPrenda(1)) {
            System.out.println("Prenda eliminada correctamente.");
        } else {
            System.out.println("No existe una prenda con ese código.");
        }

        // Mostrar nuevamente la lista
        System.out.println("\n=== LISTA ACTUALIZADA ===");
        for (PrendaDeVestir prenda : gestor.obtenerPrendas()) {
            System.out.println(prenda);
        }

        // Limpiar la lista
        gestor.limpiarLista();

        System.out.println("\nCantidad de prendas: " + gestor.obtenerPrendas().size());

    }
}
