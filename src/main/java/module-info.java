module com.example.javafxcolorchooserapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcolorchooserapp to javafx.fxml;
    exports com.example.javafxcolorchooserapp;
}