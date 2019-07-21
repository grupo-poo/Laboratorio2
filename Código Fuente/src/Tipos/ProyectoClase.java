/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author diegocarvajal
 */
public class ProyectoClase {
    private String nombre;
    private String descripcion;
    private Integer costoInicial;
    private Integer costoMinimo;
    private Integer costoFinal;

    public ProyectoClase(String nombre, String descripcion, int costoInicial, int costoMinimo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoInicial = costoInicial;
        this.costoMinimo = costoMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String escripcion) {
        this.descripcion = escripcion;
    }

    public int getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(int costoInicial) {
        this.costoInicial = costoInicial;
    }

    public int getCostoMinimo() {
        return costoMinimo;
    }

    public void setCostoMinimo(int costoMínimo) {
        this.costoMinimo = costoMínimo;
    }

    public int getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(int costoFinal) {
        this.costoFinal = costoFinal;
    }
    
    
    
    

    
}
