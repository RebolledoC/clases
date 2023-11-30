module com.example.netbooks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.netbooks to javafx.fxml;
    exports com.example.netbooks;
}