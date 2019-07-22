package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.ControladorSelect;
import Controlador.ControladorPromotor;
import Controlador.Singleton;
import Tipos.BaseDatos;
import Vistas.*;
import Tipos.ProyectoClase;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Milton Lenis
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BaseDatos bd=new BaseDatos();
        ControladorSelect controladorSelect = new ControladorSelect(bd);
        ControladorPromotor controladorSeect = new ControladorPromotor(bd);
        Vista vista = controladorSelect.getSelect();
        Scene esc = vista.getScene();
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        primaryStage.setScene(esc);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
