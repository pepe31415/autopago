package com.example.autopago;

import com.example.autopago.dispositivos.LectorCB;
import javafx.application.Application;
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
    private Stage primaryStage;
    public Stage getPrimaryStage() { return primaryStage; }
    private LectorCB lectorCB;
    public LectorCB getLectorCB() { return lectorCB;}

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        navigator = new Navigator(primaryStage);
        navigator.navegarA("pantallas/bienvenida.fxml");
        primaryStage.show();
        lectorCB = new LectorCB();
    }
}
