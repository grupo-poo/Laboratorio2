/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Tipos.BaseDatos;
import Vistas.Proyecto;
import Vistas.Vista;
import Vistas.baseDatos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author diegocarvajal
 */
public class ControladorProyecto {
    private Proyecto vista;
    private BaseDatos baseDatos; 
    
    public Proyecto getEscena(){
        return vista;
    }
    
    public ControladorProyecto(BaseDatos baseDatos){
        this.vista = new Proyecto();
        this.baseDatos=baseDatos;
        
        this.vista.getAceptar().setOnAction(new Tabla());
        
    }
    
    
     private class Tabla implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            //Crear nuevo Promotor
            baseDatos.getPromotores().get(baseDatos.getPromotores().size()-1).CrearProyecto(vista.getTfnombre().getText(),vista.getTadescripcion().getText() , vista.getTfcostoInicial().getText(),vista.getTfcostoMinimo().getText());
            ControladorBaseDatos controlador = 
                    new ControladorBaseDatos(baseDatos);
            Vista vista = controlador.getEscena();
            Singleton singleton = 
                    Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScene());
            stage.show();
            
        }
    }
}
