package com.example.autopago;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AutopagoApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Ojo!! el método getResource de una clase busca los recursos en la estructura de diretorios en resources paralela
        // al paquete donde está. Así pues, si BienvenidaController está en el paquete:
        //                     com.example.autopago.pantallas
        //entonces esa instrucción busca dentro del directorio equivalente en resources:
        //                      src/main/resources/com/example/autopago/pantallas/escaneo.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(AutopagoApplication.class.getResource("pantallas/bienvenida.fxml"));
        Parent root = fxmlLoader.load(); // convierte el fxml en una escena, scene , devuelve el nodo root de el grafo de la escena
        Scene scene = new Scene(root, 720,480);
        primaryStage.setScene(scene); // usamos el stage que ya nos ha dado el javaFX
        System.out.println(AutopagoApplication.class.getResource("pantallas/SuperTutto.jpg"));
//        VBox vbox = new VBox();
//        vbox.setAlignment(Pos.CENTER);
//        vbox.setSpacing(30);
//        Image img = new Image(getClass().getResource("/com/example/autopago/pantallas/SuperTutto.jpg").toExternalForm());
//        BackgroundImage bg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,
//                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
//                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
//        vbox.setBackground(new Background(bg));
        primaryStage.show();
    }
}
