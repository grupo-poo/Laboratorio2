package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        baseDatos p=new baseDatos();
        p.addProyecto(new ProyectoClase("PojectoPasasdasdsadasdasdasdasdasdasdasdasasda", "Hola, soy un proyecto", 10, 10));
        primaryStage.setTitle("Data base");
        primaryStage.setScene(p.getScene());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
