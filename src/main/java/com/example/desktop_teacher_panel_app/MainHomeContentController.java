package com.example.desktop_teacher_panel_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainHomeContentController {
    @FXML
    private BorderPane borderPane;
    @FXML
    private Pane container;
    private List<Button> menus = new ArrayList<>();

    private void changeButtonBackground(ActionEvent e) {
        Iterator<Button> iteratorMenus = menus.iterator();

        while (iteratorMenus.hasNext()) {
            Button clickedButton = (Button) e.getSource();
            Button OtherButton = iteratorMenus.next();
            if (clickedButton == OtherButton) {
                clickedButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#2b2a26;");
            } else {
                if (OtherButton != null) {
                    OtherButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#404040;");
                }
            }
        }
    }
    @FXML
    private void clear() {
        borderPane.setCenter(null);
    }
    @FXML
    private void loadFXML(String fileName) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource(  fileName + ".fxml"));
            //borderPane.setCenter(parent);
            container.getChildren().setAll(parent);

        } catch (IOException ex) {
            Logger.getLogger(MainHomeContentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void close() throws IOException {

        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("login_fragment.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        // stage.getIcons().add(new Image("/asset/icon.png"));
        stage.show();
    }
    @FXML
    private void uploadClass(ActionEvent e) {
        loadFXML("class_upload");
        changeButtonBackground(e);
    }

    @FXML
    private void uploadAnnouncement(ActionEvent e) {
        loadFXML("announcement_upload");
        changeButtonBackground(e);
    }

    @FXML
    private void classHistory(ActionEvent e) {
        loadFXML("class_history");
        changeButtonBackground(e);
    }

    @FXML
    private void announcementHistory(ActionEvent e) {
        loadFXML("announcement_history");
        changeButtonBackground(e);
    }
    @FXML
    private void loadHomeView(ActionEvent e) {
        loadFXML("main_home_content");
        changeButtonBackground(e);
    }
}