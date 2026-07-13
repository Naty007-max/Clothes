package com.mycompany.service;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.models.*;

public class GestorDatos {

    private List<PrendaDeVestir> prendas;

    public GestorDatos() {
        prendas = new ArrayList<>();
    }
    
    public void agregarPrenda(PrendaDeVestir prenda) {
    prendas.add(prenda);
    }

    public List<PrendaDeVestir> obtenerPrendas() {
    return prendas;
    }

    public void limpiarLista() {
    prendas.clear();
    }

    public PrendaDeVestir buscarPrenda(int codigo) {//metodo para buscar una prenda en especifico

    for (PrendaDeVestir prenda : prendas) {

        if (prenda.getCodigo() == codigo) {
            return prenda;
        }

    }

    return null;
    }

    public boolean eliminarPrenda(int codigo) {//metodo que reutiliza a buscarPrenda para eliminar una prenda

    PrendaDeVestir prenda = buscarPrenda(codigo);

    if (prenda != null) {
        prendas.remove(prenda);
        return true;
    }

    return false;
    }
    
}