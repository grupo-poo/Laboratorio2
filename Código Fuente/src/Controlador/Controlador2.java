package Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vistas.Select;
import Vistas.Promotor;
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
            Singleton singleton = Singleton.getSingleton();
            Stage stage = singleton.getStage();
            Select escena2 = new Select();
            stage.setScene(escena2.getScene());
            stage.show();
        }
    }
}
