package com.example.autopago.pantallas;

import com.example.autopago.AutopagoApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BienvenidaController {
    @FXML
    private void onComenzarBotonClick(ActionEvent actionEvent) throws IOException {
        System.out.println("Se ha pulsado boton para comenzar usando misma ventana o stage.");
        // Ojo!! el método getResource de una clase busca los recursos en la estructura de diretorios en resources paralela
        // al paquete donde está. Así pues, si BienvenidaController está en el paquete:
        //                     com.example.autopago.pantallas
        //entonces esa instrucción busca dentro del directorio equivalente en resources:
        //                      src/main/resources/com/example/autopago/pantallas/escaneo.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(BienvenidaController.class.getResource("escaneo.fxml"));
        Parent root = fxmlLoader.load(); // convierte el fxml en una escena, scene , devuelve el nodo root de el grafo de la escena
        Scene scene = new Scene(root, 720,480);
        // ahora tenemos que buscar una referencia al current stage. Para ello lo hacemos
        // a través de el botón que disparó el evento para comenzar
        Button miBotonComenzar =(Button) actionEvent.getSource();
        //desde el boton puedo tener la escena y desde ella la window.
        // .getScene().getWindow() nos devuelve una window, javafx.stage.window
        // un stage es un tipo de window por lo que podemos hacer un casting a stage
        Stage stageEscaneo = (Stage) miBotonComenzar.getScene().getWindow();
        // una vez tenemos el stage, podemos asignarle la escena que sustituirá la escena
        // inicial que se creo en la clase AutopagoApplication que es la main.
        stageEscaneo.setScene(scene);
    }
    @FXML
    private void onComenzarBotonClickNuevasVentanas(ActionEvent actionEvent) throws IOException {
        System.out.println("Se ha pulsado boton para comenzar usando nueva ventana o stage");
        FXMLLoader fxmlLoader = new FXMLLoader(BienvenidaController.class.getResource("escaneo.fxml"));
        Parent root = fxmlLoader.load();
        // Creamos un nuevo Stage (ventana)
        Stage nuevaVentana = new Stage();
        // Creamos la nueva escena y la asociamos al nuevo Stage
        Scene scene = new Scene(root, 720, 480);
        nuevaVentana.setScene(scene);
        // Pondriamos un  título a la ventana y mostramos la nueva ventana
        nuevaVentana.setTitle("Ventana de Escaneo");
        nuevaVentana.show();
    }
}
