/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author diegocarvajal
 */
public class Promotor implements Vista{
    private Label lnombre;
    private Label ledad;
    private Label lId;
    private TextField tfnombre;
    private TextField tfedad;
    private TextField tfid;
    private Button btaceptar;
    private Scene escena;
    
    
    public Promotor(){
        lnombre=new Label("Nombre");
        ledad=new Label("Edad");
        lId=new Label("ID");
        tfnombre=new TextField();
        tfedad=new TextField();
        tfid=new TextField();
        btaceptar=new Button("Aceptar");
      
        
        VBox labels=new VBox(10);
        labels.getChildren().addAll(lnombre,ledad,lId);
        labels.setAlignment(Pos.CENTER);
        VBox texts=new VBox();
        texts.getChildren().addAll(tfnombre, tfedad, tfid, btaceptar);
        texts.setAlignment(Pos.CENTER);
        HBox layout=new HBox();
        layout.getChildren().addAll(labels,texts);
        layout.setAlignment(Pos.CENTER);
        
        escena=new Scene(layout,500,500);
        
    }

    @Override
    public Scene getScene() {
       return escena;
    }
    
    
}
