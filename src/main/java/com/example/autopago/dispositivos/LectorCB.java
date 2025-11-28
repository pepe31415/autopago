package com.example.autopago.dispositivos;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LectorCB {
    AutopagoApplication app = AutopagoApplication.getInstancia();
    public LectorCB() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LectorCB.class.getResource("lectorCB.fxml"));
            Parent root =  fxmlLoader.load();
            Scene scene = new Scene(root, 400,300);
            Stage stage = new Stage(StageStyle.UTILITY);
            stage.initOwner(app.getPrimaryStage());
            stage.setTitle("Lector de Código Barras");
            stage.setScene(scene);
            stage.setY(30);
            stage.setX(30);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
