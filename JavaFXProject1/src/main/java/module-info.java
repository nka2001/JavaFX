module com.mycompany.javafxproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxproject1 to javafx.fxml;
    exports com.mycompany.javafxproject1;
}
