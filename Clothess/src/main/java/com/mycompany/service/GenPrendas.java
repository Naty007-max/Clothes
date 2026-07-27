package com.mycompany.service;

import java.util.Random;
import com.mycompany.models.PrendaDeVestir;

public class GenPrendas {
    
    private Random random = new Random();
    

    public PrendaDeVestir generarPrendaAleatoria(){
        int codigo = random.nextInt(10000);

        String[] nombres = {
            "Camiseta", "Jean", "Chaqueta", "Sudadera",
            "Vestido", "Falda", "Pantalon", "Blusa"
        };

        String[] categorias = {
            "Superior", "Inferior"
        };

        String[] tallas = {
            "XS", "S", "M", "L", "XL"
        };

        String[] marcas = {
            "Nike", "Adidas", "Puma", "Levis", "Zara"
        };

        String nombre = nombres[random.nextInt(nombres.length)];
        String categoria = categorias[random.nextInt(categorias.length)];
        String talla = tallas[random.nextInt(tallas.length)];
        String marca = marcas[random.nextInt(marcas.length)];

        int cantidad = random.nextInt(50) + 1;

        double precio = 20000 + random.nextInt(180001);

        return new PrendaDeVestir(
                codigo,
                nombre,
                categoria,
                talla,
                marca,
                cantidad,
                precio
        );
    }
    public void generarPrendas(int cantidad, GestorDatos gestor) {

    for (int i = 0; i < cantidad; i++) {
        gestor.agregarPrenda(generarPrendaAleatoria());
    }

}
}
