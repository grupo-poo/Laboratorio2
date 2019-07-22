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
    private Label lcostoInicial;
    private TextField tfnombre;
    private TextField tfcostoMinimo;
    private TextField tfcostoInicial;
    private TextArea tadescripcion;
    private Button aceptar;
    private Scene escena;
    
    
    public Proyecto(){
        lnombre=new Label("Nombre del Proyecto: ");
        ldescripcion=new Label("Descripción: ");
        lcostoMinimo=new Label("Costo Mínimo: ");
        lcostoInicial=new Label("Costo Inicial: ");
        
        tfnombre=new TextField();
        tfcostoMinimo=new TextField();
        tfcostoInicial=new TextField();
        tadescripcion=new TextArea();
        
        
        aceptar=new Button("Aceptar");
        tadescripcion.setMaxSize(200, 100);
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.add(lnombre, 0, 0);
        pane.add(tfnombre, 1, 0);
        pane.add(lcostoMinimo, 0, 1);
        pane.add(tfcostoMinimo, 1, 1);
        pane.add(lcostoInicial, 0, 2);
        pane.add(tfcostoInicial, 1, 2);
        pane.add(ldescripcion, 0, 3);
        pane.add(tadescripcion, 1, 3);
        pane.add(aceptar, 1,4);
        
      
        
        escena=new Scene(pane,500,500);
        
        
       
        
        
    }

    @Override
    public Scene getScene() {
        return escena;
    }

    public Label getLnombre() {
        return lnombre;
    }

    public void setLnombre(Label lnombre) {
        this.lnombre = lnombre;
    }

    public Label getLdescripcion() {
        return ldescripcion;
    }

    public void setLdescripcion(Label ldescripcion) {
        this.ldescripcion = ldescripcion;
    }

    public Label getLcostoMinimo() {
        return lcostoMinimo;
    }

    public void setLcostoMinimo(Label lcostoMinimo) {
        this.lcostoMinimo = lcostoMinimo;
    }

    public TextField getTfnombre() {
        return tfnombre;
    }

    public void setTfnombre(TextField tfnombre) {
        this.tfnombre = tfnombre;
    }

    public TextField getTfcostoMinimo() {
        return tfcostoMinimo;
    }

    public void setTfcostoMinimo(TextField tfcostoMinimo) {
        this.tfcostoMinimo = tfcostoMinimo;
    }

    public TextArea getTadescripcion() {
        return tadescripcion;
    }

    public void setTadescripcion(TextArea tadescripcion) {
        this.tadescripcion = tadescripcion;
    }

    public Button getAceptar() {
        return aceptar;
    }

    public void setAceptar(Button aceptar) {
        this.aceptar = aceptar;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Label getLcostoInicial() {
        return lcostoInicial;
    }

    public void setLcostoInicial(Label lcostoInicial) {
        this.lcostoInicial = lcostoInicial;
    }

    public TextField getTfcostoInicial() {
        return tfcostoInicial;
    }

    public void setTfcostoInicial(TextField tfcostoInicial) {
        this.tfcostoInicial = tfcostoInicial;
    }
    
    
    
    
    
}
