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
import javafx.scene.layout.VBox;

/**
 *
 * @author diegocarvajal
 */
public class Proyecto {
    private Label lnombre;
    private Label ldescripcion;
    private Label lcostoMinimo;
    private TextField tfnombre;
    private TextField tfcostoMinimo;
    private TextArea tadescripcion;
    private Button aceptar;
    
    
    public Proyecto(){
        lnombre=new Label("Nombre: ");
        ldescripcion=new Label("Descripción: ");
        lcostoMinimo=new Label("Costo Mínimo: ");
        VBox labels=new VBox();
        labels.getChildren().addAll(lnombre,lcostoMinimo,ldescripcion);
        tfnombre=new TextField();
        tfcostoMinimo=new TextField();
        tadescripcion=new TextArea();
        aceptar=new Button("Aceptar");
        VBox texts=new VBox();
        texts.getChildren().addAll(tfnombre,tfcostoMinimo, tadescripcion);
        
        
        
    }
    
}
