/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author diegocarvajal
 */
public class Proyecto implements Vista{
    private Label lnombre;
    private Label ldescripcion;
    private Label lcostoMinimo;
    private TextField tfnombre;
    private TextField tfcostoMinimo;
    private TextArea tadescripcion;
    private Button aceptar;
    private Scene escena;
    
    
    public Proyecto(){
        lnombre=new Label("Nombre: ");
        ldescripcion=new Label("Descripción: ");
        lcostoMinimo=new Label("Costo Mínimo: ");
        
        tfnombre=new TextField();
        tfcostoMinimo=new TextField();
        tadescripcion=new TextArea();
        aceptar=new Button("Aceptar");
        
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.add(lnombre, 0, 0);
        pane.add(tfnombre, 1, 0);
        pane.add(lcostoMinimo, 0, 1);
        pane.add(tfcostoMinimo, 1, 1);
        pane.add(ldescripcion, 1, 2);
      
        
        escena=new Scene(pane,500,500);
        
        
       
        
        
    }

    @Override
    public Scene getScene() {
        return escena;
    }
    
}
