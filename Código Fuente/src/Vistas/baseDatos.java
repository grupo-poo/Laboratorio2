package Vistas;

import Tipos.BaseDatos;
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
import Tipos.*;
import javafx.scene.control.Button;

public class baseDatos implements Vista{
    private Label proyectos;
    private TableView table;
    private TableColumn<ProyectoClase,String> financiado;
    private TableColumn<ProyectoClase,String> nombre;
    private TableColumn<ProyectoClase, Integer> costoInicial;
    private TableColumn<ProyectoClase, Integer> costoMinimo;
    private TableColumn tasaInteres;
    private ObservableList<ProyectoClase> listaObjetos;
    
    private Button comprar;
    private Button RegresarInicio;
    
    private Scene escena;

    public baseDatos(BaseDatos baseDatos) {
        comprar=new Button("Comprar");
        RegresarInicio=new Button("Home");
        proyectos = new Label("Proyectos");
        table = new TableView();
        listaObjetos= FXCollections.observableArrayList();
        table.setItems(listaObjetos);
        
         financiado= new TableColumn<>("Financiado");
        financiado.setCellValueFactory(new PropertyValueFactory<ProyectoClase, String>("financiado"));
        
        
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
        tasaInteres = new TableColumn("Tasa de Interés");
        
        
        for(PromotorClase p: baseDatos.getPromotores()){
           listaObjetos.add(p.getProyecto());
        }
        
        table.getColumns().addAll(financiado, nombre, costoInicial, costoMinimo, tasaInteres);
        GridPane layout=new GridPane();
        
        
        layout.add(table, 0, 0);
        layout.add(comprar, 3, 2);
        layout.add(RegresarInicio, 5,2);
        
        
        escena=new Scene(layout,600,300);
    }

    @Override
    public Scene getScene() {
        return escena;
    }

    public Button getComprar() {
        return comprar;
    }

    public void setComprar(Button comprar) {
        this.comprar = comprar;
    }

    public Button getRegresarInicio() {
        return RegresarInicio;
    }

    public void setRegresarInicio(Button RegresarInicio) {
        this.RegresarInicio = RegresarInicio;
    }
    
    
}
