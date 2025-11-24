package com.example.autopago.pantallas;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class BienvenidaController {
    private AutopagoApplication app = AutopagoApplication.getInstancia();
    private Navigator navigator = app.getNavigator();
    @FXML
    private void onComenzarBotonClick(ActionEvent actionEvent)  {
        System.out.println("Se ha pulsado boton para comenzar usando misma ventana o stage.");
        navigator.navegarA("pantallas/escaneo.fxml");
    }

}
