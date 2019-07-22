package Controlador;
import Tipos.BaseDatos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vistas.Select;
import Vistas.Promotor;
import Vistas.Vista;
import Vistas.baseDatos;


public class ControladorPromotor {
    private Promotor promotor;
    private BaseDatos baseDatos;
   
    public Promotor getEscena(){
        return promotor;
    }
    public ControladorPromotor(BaseDatos baseDatos){
        this.promotor = new Promotor();
        this.promotor.getHouseBt().setOnAction(new Home());
        this.promotor.getBtaceptar().setOnAction(new Tabla());
        this.baseDatos=baseDatos;
        
    }
    
    private class Home implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            ControladorSelect controlador = 
                    new ControladorSelect(baseDatos);
            Vista vista = controlador.getSelect();
            Singleton singleton = 
                    Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScene());
            stage.show();
            
        }
    }
    
    private class Tabla implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            //Crear nuevo Promotor
            baseDatos.addPromotor(promotor.getTfnombre().getText(), promotor.getTfid().getText(), promotor.getTfedad().getText());
            
            ControladorProyecto controlador = 
                    new ControladorProyecto(baseDatos);
            Vista vista = controlador.getEscena();
            Singleton singleton = 
                    Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScene());
            stage.show();
            
        }
    }
    
    
        

    public Promotor getPromotor() {
        return promotor;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    }
    
    
}
