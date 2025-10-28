package com.example.autopago;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AutopagoApplicationProfe extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AutopagoApplicationProfe.class.getResource("pantallas/bienvenida.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 720,480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
