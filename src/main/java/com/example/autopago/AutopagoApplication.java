package com.example.autopago;

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
    @Override
    public void start(Stage primaryStage) {
        navigator = new Navigator(primaryStage);
        navigator.navegarA("pantallas/bienvenida.fxml");
        primaryStage.show();
    }
}
