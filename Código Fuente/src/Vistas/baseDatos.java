package Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class baseDatos {
    private Label proyectos;
    private TableView table;
    private TableColumn autor;
    private TableColumn nombre;
    private TableColumn costo;
    private TableColumn tasaInteres;
    
    private Scene escena;

    public baseDatos() {
        proyectos = new Label("Proyectos");
        table = new TableView();
        autor = new TableColumn("autor");
        nombre = new TableColumn("nombre");
        costo = new TableColumn("costo");
        tasaInteres = new TableColumn("tasa de interés");
        
        table.getColumns().addAll(autor, nombre, costo, tasaInteres);
        
        VBox layout = new VBox();
        
        layout.getChildren().addAll(proyectos,table);
        layout.setAlignment(Pos.CENTER);
        
        escena=new Scene(layout,500,500);
    }
}
