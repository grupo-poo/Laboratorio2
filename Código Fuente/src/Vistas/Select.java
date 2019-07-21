/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author diegocarvajal
 */
public class Select implements Vista{
    
    private Label titulo;
    private Button promotor;
    private Button inversionista;
    private Scene escena;

    public Button getPromotor() {
        return promotor;
    }

    public Button getInversionista() {
        return inversionista;
    }
    
   public Select() {
        titulo=new Label();
        titulo.setText("¿Quién sos?");
        promotor=new Button("Promotor");
        inversionista=new Button("Inversionista");
    
        VBox VBox1 = new VBox();
        VBox1.getChildren().addAll(titulo, promotor, inversionista);
        VBox1.setAlignment(Pos.CENTER);
        escena=new Scene(VBox1,500,500);
        
    }

    @Override
    public Scene getScene() {
        return escena;
    }

}
