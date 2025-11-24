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
    private static AutopagoApplication instancia;
    public static AutopagoApplication getInstancia() {
        return instancia;
    }
    public AutopagoApplication() {
        instancia = this;
    }
    private Navigator navigator;
    public Navigator getNavigator() {
        return this.navigator;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AutopagoApplication.class.getResource("pantallas/bienvenida.fxml"));
        Parent root = fxmlLoader.load(); // convierte el fxml en una escena, scene , devuelve el nodo root de el grafo de la escena
        Scene scene = new Scene(root, 720,480);
        primaryStage.setScene(scene); // usamos el stage que ya nos ha dado el javaFX

        primaryStage.show();
    }
}
