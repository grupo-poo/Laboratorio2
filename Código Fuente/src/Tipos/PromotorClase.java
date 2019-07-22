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
public class PromotorClase extends Persona{
    private ProyectoClase proyecto;
    
    public PromotorClase(String nombre, String nit, String edad) {
        super(nombre, Integer.valueOf(nit), Integer.valueOf(edad));
    }

    public ProyectoClase getProyecto() {
        return proyecto;
    }
    
    
    public void CrearProyecto(String nombre, String descripcion, String costoInicial, String costoMinimo) {
            this.proyecto=new ProyectoClase(nombre, descripcion, costoInicial, costoMinimo);
        }
    
    
    
    

    
    
    
    
}
