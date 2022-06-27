module com.example.clashroyale {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clashroyale to javafx.fxml;
    exports com.example.clashroyale;
}