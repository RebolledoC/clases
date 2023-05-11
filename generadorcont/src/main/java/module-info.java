module com.example.generadorcont {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.generadorcont to javafx.fxml;
    exports com.example.generadorcont;
}