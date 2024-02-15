module com.mycompany.cursosem2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.cursosem2 to javafx.fxml;
    exports com.mycompany.cursosem2;
}
