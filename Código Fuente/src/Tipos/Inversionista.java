/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

/**
 *
 * @author diegocarvajal
 */
public class Inversionista extends Persona {
    private double montoToal;
    
    public Inversionista(String nombre, int nit, int edad) {
        super(nombre, nit, edad);
    }
    
    

    public double getMontoToal() {
        return montoToal;
    }

    public void setMontoToal(double montoToal) {
        this.montoToal = montoToal;
    }
    
    
    
    
}
