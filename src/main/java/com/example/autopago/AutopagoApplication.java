package com.example.autopago;

import com.example.autopago.dispositivos.LectorCB;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Aplicación de autopago que implementa un sistema de caja de autoservicio
 * para supermercados utilizando JavaFX.
 * <p>
 * Esta clase actúa como punto de entrada de la aplicación JavaFX y mantiene
 * referencias globales al {@link Stage} principal, al {@link Navigator} y al
 * {@link LectorCB}.
 * </p>
 *
 * @author JM Castillo
 * @version 1.0
 */
public class AutopagoApplication extends Application {
    /**
     * Instancia única de la aplicación, accesible de forma estática.
     */
    private static AutopagoApplication instancia;
    /**
     * Devuelve la instancia única de {@code AutopagoApplication}.
     * <p>
     * Este método permite acceder a la aplicación desde otras clases sin necesidad
     * de pasar la referencia explícitamente.
     * </p>
     *
     * @return instancia única de la aplicación o {@code null} si aún no se ha creado
     */
    public static AutopagoApplication getInstancia() {
        return instancia;
    }
    /**
     * Crea una nueva instancia de la aplicación y la registra como instancia única.
     * <p>
     * El propio framework de JavaFX se encargará de crear esta instancia al
     * iniciar la aplicación.
     * </p>
     */
    public AutopagoApplication() {
        instancia = this;
    }
    /**
     * Objeto responsable de gestionar la navegación entre pantallas (escenas) de la aplicación.
     */
    private Navigator navigator;
    /**
     * Devuelve el {@link Navigator} asociado a la aplicación.
     *
     * @return objeto {@link Navigator} que gestiona el cambio de pantallas
     */
    public Navigator getNavigator() {
        return this.navigator;
    }
    /**
     * Escenario principal de la aplicación, sobre el que se mostrarán las escenas JavaFX.
     */
    private Stage primaryStage;
    /**
     * Devuelve el escenario (ventana) principal de la aplicación.
     *
     * @return {@link Stage} principal de la aplicación
     */
    public Stage getPrimaryStage() { return primaryStage; }
    /**
     * Lector de códigos de barras utilizado para capturar los productos
     * durante el proceso de autopago.
     */
    private LectorCB lectorCB;
    /**
     * Devuelve el lector de códigos de barras utilizado por la aplicación.
     *
     * @return instancia de {@link LectorCB} asociada a la aplicación
     */
    public LectorCB getLectorCB() { return lectorCB;}
    /**
     * Punto de entrada de la aplicación JavaFX.
     * <p>
     * Inicializa el escenario principal, configura el {@link Navigator} para
     * gestionar las pantallas, navega a la pantalla de bienvenida y crea el
     * lector de códigos de barras.
     * </p>
     *
     * @param primaryStage escenario o ventana principal donde se mostrarán las escenas
     */
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        navigator = new Navigator(primaryStage);


        primaryStage.show();
        // Deja que JavaFX pinte la ventana y luego sigue
       /*Platform.runLater( () -> {
            lectorCB = new LectorCB();
            navigator.navegarA("pantallas/bienvenida.fxml");
        });*/
        lectorCB = new LectorCB();
        navigator.navegarA("pantallas/bienvenida.fxml");
        //bloqueo hecho a propósito para ver el efecto del Application thread de JavaFX
        /*try {
            System.out.println("Esperando 10 segundos..");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }*/
    }
}
