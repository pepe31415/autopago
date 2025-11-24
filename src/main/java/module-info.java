module com.example.autopago {
    requires javafx.controls;
    requires javafx.fxml;
    //requires com.example.autopago;
    requires javafx.graphics;
    //requires com.example.autopago;

    opens com.example.autopago to javafx.fxml;
    exports com.example.autopago;

    opens com.example.autopago.pantallas;
    exports com.example.autopago.pantallas;
}
