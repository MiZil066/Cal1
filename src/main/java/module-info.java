module com.example.cal1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cal1 to javafx.fxml;
    exports com.example.cal1;
}