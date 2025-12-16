package com.example.autopago.pantallas;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import com.example.autopago.dispositivos.LectorCB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class BienvenidaController implements LectorCB.EventListener{
    private AutopagoApplication app = AutopagoApplication.getInstancia();
    private Navigator navigator = app.getNavigator();
    private LectorCB lectorCB = app.getLectorCB();
    public BienvenidaController() {
        lectorCB.connect(this);
    }
    @FXML
    private void onComenzarBotonClick(ActionEvent actionEvent)  {
        System.out.println("Se ha pulsado boton para comenzar usando misma ventana o stage.");
        navigator.navegarA("pantallas/escaneo.fxml");
    }

    @Override
    public void alEscanearCB(String codigoBarras) {
        System.out.println("BienvenidaController recibió CB:" + codigoBarras);
    }
}
