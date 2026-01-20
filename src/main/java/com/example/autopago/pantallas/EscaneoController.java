package com.example.autopago.pantallas;

import com.example.autopago.AutopagoApplication;
import com.example.autopago.Navigator;
import com.example.autopago.dispositivos.LectorCB;
import com.example.autopago.model.Producto;
import com.example.autopago.repositorios.RepositorioProductos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EscaneoController implements LectorCB.EventListener {
    private AutopagoApplication app = AutopagoApplication.getInstancia();
    private Navigator navigator = app. getNavigator();
    private LectorCB lectorCB = app.getLectorCB();
    private RepositorioProductos repositorioProductos = app.getRepositorioProductos();

    public EscaneoController() {
        lectorCB.connect(this);
    }
    @FXML
    private void onCancelButtonClick(ActionEvent actionEvent) {
        System.out.println("Se ha pulsado boton cancelar de la escena escaneo.");
        navigator.navegarA("pantallas/bienvenida.fxml");
    }
    @FXML
    private void onPagarButtonClick(ActionEvent actionEvent) {
        System.out.println("Se ha pulsado el boton pagar en la escena escaneo.");
    }

    @Override
    public void alEscanearCB(String codigoBarras) {
       System.out.println("EscaneoController recibió CB:" + codigoBarras);
       Producto producto = repositorioProductos.encuentraProducto(codigoBarras);
       if (producto != null) {
           System.out.println("Producto escaneado: " + producto.getNombre());
       }
       else {
           System.out.println("Producto no encontrado.");
       }

    }
}
