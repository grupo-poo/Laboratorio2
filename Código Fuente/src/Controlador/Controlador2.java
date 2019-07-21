package Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vistas.Select;
import Vistas.Promotor;
import Vistas.Vista;
import Vistas.baseDatos;
public class Controlador2 {
    private Promotor promotor;
    
    public Promotor getEscena(){
        return promotor;
    }
    public Controlador2(){
        this.promotor = new Promotor();
        this.promotor.getHouseBt().setOnAction(new Home());
    }
    
    private class Home implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Hola");
            Controlador1 controlador = 
                    new Controlador1();
            Vista vista = controlador.getSelect();
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
