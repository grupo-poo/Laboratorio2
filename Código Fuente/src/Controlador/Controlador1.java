package Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vistas.Select;
import Vistas.Promotor;
import Vistas.baseDatos;
import javafx.scene.Scene;
public class Controlador1 {
    private Select select;
    
    public Select getEscena(){
        return select;
    }
    public Controlador1(){
        this.select = new Select();
        this.select.getPromotor().setOnAction(new Evento1());
        this.select.getInversionista().setOnAction(new Evento2());
    }
    private class Evento1 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Stage stage = singleton.getStage();
            Promotor escena2 = new Promotor();
            stage.setScene(escena2.getScene());
            stage.show();
//            Controlador2 controlador = new Controlador2();
//            Promotor escena = controlador.getEscena();
        }
        
    }
    private class Evento2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Stage stage = singleton.getStage();
            baseDatos escena2 = new baseDatos();
            stage.setScene(escena2.getScene());
            stage.show();
        }
    }
}
