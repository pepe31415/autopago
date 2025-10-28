module com.example.autopago {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.autopago to javafx.fxml;
    exports com.example.autopago;
}
