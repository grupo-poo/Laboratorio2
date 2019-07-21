package Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Promotor implements Vista{
    private String home = "🏠"+"  Home";
    private Label lnombre;
    private Label ledad;
    private Label lId;
    private TextField tfnombre;
    private TextField tfedad;
    private TextField tfid;
    private Button btaceptar;
    private Button houseBt;
    private Scene escena;

    public Button getHouseBt() {
        return houseBt;
    }
    
    public Promotor(){
        lnombre=new Label("Nombre");
        ledad=new Label("Edad");
        lId=new Label("ID");
        tfnombre=new TextField();
        tfedad=new TextField();
        tfid=new TextField();
        btaceptar=new Button("Aceptar");
        houseBt = new Button(home);
      
        
        VBox labels = new VBox(13);
        labels.getChildren().addAll(lnombre,ledad,lId);
        
        VBox texts = new VBox();
        texts.getChildren().addAll(tfnombre, tfedad, tfid, btaceptar);
        
        HBox principal = new HBox();
        principal.getChildren().addAll(labels,texts);
        
        VBox layout = new VBox();
        layout.getChildren().addAll(houseBt,principal);
        escena=new Scene(layout,250,150);
        
    }

    @Override
    public Scene getScene() {
       return escena;
    }
    
    
}
