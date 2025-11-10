package com.example.autopago.pantallas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EscaneoController {
 @FXML
    private void onCancelButtonClick(ActionEvent actionEvent) {
     System.out.println("Se ha pulsado boton cancelar de la escena escaneo.");
 }
 @FXML
    private void onPagarButtonClick(ActionEvent actionEvent) {
     System.out.println("Se ha pulsado el boton pagar en la escena escaneo.");
 }
}
