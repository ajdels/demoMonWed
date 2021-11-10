module com.example.demomonwed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demomonwed to javafx.fxml;
    exports com.example.demomonwed;
}