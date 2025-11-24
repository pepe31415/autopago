package com.example.autopago;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator {
    private Stage primaryStage;
    public Navigator(Stage stage) {
        this.primaryStage = stage;
    }
    public void navegarA(String nombreEscena)  {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Navigator.class.getResource(nombreEscena));
                Parent root =  fxmlLoader.load();
                Scene scene = new Scene(root, 720,480);
                this.primaryStage.setScene(scene);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
