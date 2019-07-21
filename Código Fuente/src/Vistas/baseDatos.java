package Vistas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import Tipos.ProyectoClase;

public class baseDatos implements Vista{
    private Label proyectos;
    private TableView table;
    private TableColumn<ProyectoClase,String> autor;
    private TableColumn<ProyectoClase,String> nombre;
    private TableColumn<ProyectoClase, Integer> costoInicial;
    private TableColumn<ProyectoClase, Integer> costoMinimo;
    private TableColumn tasaInteres;
    private ObservableList<ProyectoClase> listaObjetos;
    
    private Scene escena;

    public baseDatos() {
        proyectos = new Label("Proyectos");
        table = new TableView();
        listaObjetos= FXCollections.observableArrayList();
        table.setItems(listaObjetos);
        
        autor = new TableColumn<>("autor");
        
        
        nombre = new TableColumn<>("Nombre");
        //Nombre Colomna
        nombre.setCellValueFactory(new PropertyValueFactory<ProyectoClase, String>("nombre"));
        //Costo Inicial-Columna
        costoInicial = new TableColumn<>("Costo Inicial");
        costoInicial.setCellValueFactory(new PropertyValueFactory<ProyectoClase, Integer>("costoInicial"));
        //CostoMinimo-Colomna
        costoMinimo = new TableColumn<>("Costo Minimo");
        costoMinimo.setCellValueFactory(new PropertyValueFactory<ProyectoClase, Integer>("costoMinimo"));
        //Tasa de interés - Colomna 
        tasaInteres = new TableColumn("tasa de interés");
        
        table.getColumns().addAll(autor, nombre, costoInicial, costoMinimo, tasaInteres);
        
        VBox layout = new VBox();
        
        layout.getChildren().addAll(proyectos,table);
        layout.setAlignment(Pos.CENTER);
        
        escena=new Scene(layout,500,500);
    }
    
    
    public void addProyecto(ProyectoClase e){
        listaObjetos.add(e);
    }

    @Override
    public Scene getScene() {
        return escena;
    }
}
