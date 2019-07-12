/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author diegocarvajal
 */
public class Proyecto {
    private Label lnombre;
    private Label ldescripcion;
    private Label lCostoMinimo;
    private TextField tfnombre;
    private TextField tfcostoMinimo;
    private TextArea tadescripcion;
    private Button aceptar;
    
    
    public Proyecto(){
        lnombre=new Label("Nombre: ");
        ldescripcion=new Label("Descripción: ")
    }
    
}
