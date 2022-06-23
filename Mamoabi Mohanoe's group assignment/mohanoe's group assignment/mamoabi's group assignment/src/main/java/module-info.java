module com.example.plus {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.plus to javafx.fxml;
    exports com.example.plus;
}