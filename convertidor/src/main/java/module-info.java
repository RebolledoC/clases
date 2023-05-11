module com.example.convertidor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.convertidor to javafx.fxml;
    exports com.example.convertidor;
}