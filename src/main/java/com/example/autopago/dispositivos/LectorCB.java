package com.example.autopago.dispositivos;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LectorCB {
    AutopagoApplication app = AutopagoApplication.getInstancia();
    @FXML
    private TextField textoCB;
    private EventListener eventListener;
    public LectorCB() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LectorCB.class.getResource("lectorCB.fxml"));

            fxmlLoader.setController(this);

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
    @FXML
    private void onEscaneoClick() {
        //System.out.println("Escaneo codigo:"+textoCB.getText());
        if (eventListener != null) {
            eventListener.alEscanearCB(textoCB.getText());
        }
        textoCB.setText("");
    }
    public void connect(EventListener eventListener) {
        this.eventListener = eventListener;
    }
    public interface EventListener {
        void alEscanearCB(String codigoBarras);
    }
}
