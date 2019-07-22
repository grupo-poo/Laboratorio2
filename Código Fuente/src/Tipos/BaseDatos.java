/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

import java.util.ArrayList;

/**
 *
 * @author diegocarvajal
 */
public class BaseDatos {
    private ArrayList<PromotorClase> promotores;
    private ArrayList<Inversionista> inversionistas;
    
    public BaseDatos(){
        this.inversionistas=new ArrayList<>();
        this.promotores=new ArrayList<>();
    }
    
    
    public void addPromotor(String nombre, String nit, String edad){
        this.promotores.add(new PromotorClase(nombre, nit, edad));
    }
    
    public void addInversionista(String nombre, int nit, int edad){
        this.inversionistas.add(new Inversionista(nombre, nit, edad));
    }

    public ArrayList<PromotorClase> getPromotores() {
        return promotores;
    }

    public void setPromotores(ArrayList<PromotorClase> promotores) {
        this.promotores = promotores;
    }

    public ArrayList<Inversionista> getInversionistas() {
        return inversionistas;
    }

    public void setInversionistas(ArrayList<Inversionista> inversionistas) {
        this.inversionistas = inversionistas;
    }
    
    
    
}
