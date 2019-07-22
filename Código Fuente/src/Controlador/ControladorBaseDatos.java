/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Tipos.BaseDatos;
import Vistas.Vista;
import Vistas.baseDatos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author diegocarvajal
 */
public class ControladorBaseDatos {
    private baseDatos vista;
    private BaseDatos baseD;
    
    public baseDatos getEscena(){
        return vista;
    }
    
    public ControladorBaseDatos(BaseDatos baseDatos){
        this.baseD=baseDatos;
        this.vista = new baseDatos(baseDatos);
        this.vista.getRegresarInicio().setOnAction(new Return());
        
        
    }
    
    
    private class Return implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            //Crear nuevo Promotor
            ControladorSelect controlador = 
                    new ControladorSelect(baseD);
            Vista vista = controlador.getSelect();
            Singleton singleton = 
                    Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScene());
            stage.show();
            
        }
    }
    
    
}
