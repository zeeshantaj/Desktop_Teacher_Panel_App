module com.example.desktop_teacher_panel_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;

    requires java.logging;
    requires firebase.admin;
    requires com.google.auth.oauth2;


    opens com.example.desktop_teacher_panel_app to javafx.fxml;
    exports com.example.desktop_teacher_panel_app;
}