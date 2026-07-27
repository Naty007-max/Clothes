package com.mycompany.IO;

import com.mycompany.models.PrendaDeVestir;
import com.mycompany.service.GestorDatos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lectorTXT {
    public void cargarArchivo(File archivo, GestorDatos gestor) {
         gestor.limpiarLista();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(",");

                int codigo = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String categoria = datos[2];
                String talla = datos[3];
                String marca = datos[4];
                int cantidad = Integer.parseInt(datos[5]);
                double precio = Double.parseDouble(datos[6]);

                PrendaDeVestir prenda = new PrendaDeVestir(
                        codigo,
                        nombre,
                        categoria,
                        talla,
                        marca,
                        cantidad,
                        precio
                );

                gestor.agregarPrenda(prenda);

            }

        } catch (IOException e) {

            System.out.println("Error al leer el archivo: " + e.getMessage());

        }
    }
    



}
