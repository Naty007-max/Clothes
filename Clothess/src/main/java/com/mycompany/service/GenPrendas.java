package com.mycompany.service;

import java.util.Random;
import com.mycompany.models.PrendaDeVestir;

public class GenPrendas {
    
    private Random random = new Random();
    

    public PrendaDeVestir generarPrendaAleatoria(){
        return null;
    }
    public void generarPrendas(int cantidad, GestorDatos gestor) {

    for (int i = 0; i < cantidad; i++) {
        gestor.agregarPrenda(generarPrendaAleatoria());
    }

}
}
