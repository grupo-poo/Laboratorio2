package Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vistas.Select;
import Vistas.Promotor;
import Vistas.Vista;
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
                    
          Controlador2 controlador = new Controlador2();
          Vista vista = controlador.getPromotor();
          stage.setScene(vista.getScene());
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
                    
          Controlador2 controlador = new Controlador2();
          Vista vista = controlador.getPromotor();
          stage.setScene(vista.getScene());
          stage.show();
        }
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }
    
}
