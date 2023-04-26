module com.example.snifpoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snifpoo to javafx.fxml;
    exports com.example.snifpoo;
}