package com.example.desktop_teacher_panel_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPanel extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(MainPanel.class.getResource("login_fragment.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

        Parent root = FXMLLoader.load(getClass().getResource("login_fragment.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        stage.show();

        // todo focus of cursor somewhere from textField
        scene.getRoot().requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}