package com.example.autopago.pantallas;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EscaneoController {
    private AutopagoApplication app = AutopagoApplication.getInstancia();
    private Navigator navigator = app. getNavigator();
    @FXML
    private void onCancelButtonClick(ActionEvent actionEvent) {
        System.out.println("Se ha pulsado boton cancelar de la escena escaneo.");
        navigator.navegarA("pantallas/bienvenida.fxml");
    }
    @FXML
    private void onPagarButtonClick(ActionEvent actionEvent) {
        System.out.println("Se ha pulsado el boton pagar en la escena escaneo.");
    }
}
