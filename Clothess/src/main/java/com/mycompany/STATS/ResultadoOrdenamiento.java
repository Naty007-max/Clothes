package com.mycompany.STATS;

import java.util.List;
import com.mycompany.models.PrendaDeVestir;

public class ResultadoOrdenamiento {
     private String nombreAlgoritmo;
    private long tiempoEjecucion;
    private int comparaciones;
    private int intercambios;
    private List<PrendaDeVestir> prendasOrdenadas;

    public ResultadoOrdenamiento() {
    }

    public ResultadoOrdenamiento(String nombreAlgoritmo,
                                 long tiempoEjecucion,
                                 int comparaciones,
                                 int intercambios, List<PrendaDeVestir> prendasOrdenadas) {

        this.nombreAlgoritmo = nombreAlgoritmo;
        this.tiempoEjecucion = tiempoEjecucion;
        this.comparaciones = comparaciones;
        this.intercambios = intercambios;
        this.prendasOrdenadas = prendasOrdenadas;
    }
    
    public List<PrendaDeVestir> getPrendasOrdenadas() {
        return prendasOrdenadas;
    }

    public void setPrendasOrdenadas(List<PrendaDeVestir> prendasOrdenadas) {
        this.prendasOrdenadas = prendasOrdenadas;
    }
    public String getNombreAlgoritmo() {
        return nombreAlgoritmo;
    }

    public void setNombreAlgoritmo(String nombreAlgoritmo) {
        this.nombreAlgoritmo = nombreAlgoritmo;
    }

    public long getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(long tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion/100000000;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public void setComparaciones(int comparaciones) {
        this.comparaciones = comparaciones;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public void setIntercambios(int intercambios) {
        this.intercambios = intercambios;
    }

    @Override
    public String toString() {
        return "ResultadoOrdenamiento{" +
                "nombreAlgoritmo='" + nombreAlgoritmo + '\'' +
                ", tiempoEjecucion=" + tiempoEjecucion +
                ", comparaciones=" + comparaciones +
                ", intercambios=" + intercambios +
                '}';
    }
}
