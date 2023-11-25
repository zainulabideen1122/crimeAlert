module com.example.crimealert {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens com.example.crimealert to javafx.fxml;
    exports com.example.crimealert;
    exports com.example.crimealert.view;
    opens com.example.crimealert.view to javafx.fxml;
    exports com.example.crimealert.controllor;
    opens com.example.crimealert.controllor to javafx.fxml;
}