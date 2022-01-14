module com.example.cuadrit0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cuadrit0 to javafx.fxml;
    exports com.example.cuadrit0;
}