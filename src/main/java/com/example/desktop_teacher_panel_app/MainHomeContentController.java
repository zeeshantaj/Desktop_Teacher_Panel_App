package com.example.desktop_teacher_panel_app;

import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainHomeContentController {
    @FXML
    private BorderPane borderPane;
    @FXML
    private Pane container;
    @FXML
    private VBox vBoxContainer;
    private List<Button> menus = new ArrayList<>();
    @FXML private Button uploadClass;
    @FXML private Button uploadAnnouncement;
    @FXML private Button classHistory;
    @FXML private Button announcementHistory;
    private String currentFXML = "";
    private void changeButtonBackground() {
        //Iterator<Button> iteratorMenus = menus.iterator();

//        while (iteratorMenus.hasNext()) {
//            Button clickedButton = (Button) e.getSource();
//            Button OtherButton = iteratorMenus.next();
//            if (clickedButton == OtherButton) {
//                clickedButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#2b2a26;");
//
//            } else {
//                if (OtherButton != null) {
//                    OtherButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#404040;");
//                }
//            }
//        }
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
    private void uploadAnnouncement(ActionEvent e) {
        loadFXML("announcement_upload");
        //changeButtonBackground(e);
    }
    public void initialize() {
//        loadFXML("class_upload");
//
//        // Create a map to associate buttons with their corresponding FXML file names
//        Map<Button, String> buttonFXMLMap = new HashMap<>();
//        buttonFXMLMap.put(uploadClass, "class_upload");
//        buttonFXMLMap.put(classHistory, "class_history");
//        buttonFXMLMap.put(announcementHistory, "announcement_history");
//        buttonFXMLMap.put(uploadAnnouncement, "announcement_upload");
//
//
//        // Set styles and initialize button actions
//        for (Button menuButton : menus) {
//            menuButton.setStyle("-fx-background-color: #03c2fc; -fx-padding: 5px;");
//
//            // Add the button to the container
//            vBoxContainer.getChildren().add(menuButton);
//
//            // Handle button clicks
//            menuButton.setOnMouseClicked(event -> {
//                handleButtonAction(menuButton, buttonFXMLMap.get(menuButton));
//                AlertDialogue.showAlert("tto","ads"+menuButton.getText(), Alert.AlertType.WARNING);
//            });
//        }
//
//        // Set the selected button color (for the initial loaded FXML)
//        uploadClass.setStyle("-fx-background-color: MediumSeaGreen; -fx-padding: 5px;");
        //
//
//        for (Button menuButton: menus){
//            vBoxContainer.getChildren().add(menuButton);
//            menuButton.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #0000FF; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");
//        }
//        uploadClass.setOnMouseClicked(event -> {
//            loadFXML("class_upload");
//
//        });
//        classHistory.setOnMouseClicked(event -> {
//            loadFXML("class_history");
//        });
//        announcementHistory.setOnMouseClicked(event -> {
//            loadFXML("announcement_history");
//        });
//        uploadAnnouncement.setOnMouseClicked(event -> {
//            loadFXML("announcement_upload");
//        });
            loadFXML("class_upload");

            uploadClass.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #4300bc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");
            classHistory.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #03c2fc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");
            uploadAnnouncement.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #03c2fc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");
            announcementHistory.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #03c2fc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");

            menus.add(uploadClass);
            menus.add(classHistory);
            menus.add(uploadAnnouncement);
            menus.add(announcementHistory);
            for (Button button : menus) {
                button.setOnMouseClicked(event -> {
                    Button clickedButton = (Button) event.getSource();

                    for (Button menuButton : menus) {
                        if (menuButton == clickedButton) {
                            menuButton.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #4300bc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");

                            // Load corresponding FXML based on the clicked button
                            if (menuButton == uploadClass) {
                                loadFXML("class_upload");
                            } else if (menuButton == classHistory) {
                                loadFXML("class_history");
                            } else if (menuButton == uploadAnnouncement) {
                                loadFXML("announcement_upload");
                            } else if (menuButton == announcementHistory) {
                                loadFXML("announcement_history");
                            }
                        } else {
                            menuButton.setStyle("-fx-text-fill: #f0f0f0; -fx-background-color: #03c2fc; -fx-padding: 5px; -fx-border-image-insets: 5px; -fx-background-insets: 5px;");
                        }
                    }
                });
            }

// blue color #0000FF

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
    private void handleButtonAction(Button clickedButton, String fxmlFileName) {
        // Reset styles for all buttons
        menus.add(uploadClass);
        menus.add(classHistory);
        menus.add(announcementHistory);
        menus.add(uploadAnnouncement);
        for (Button menuButton : menus) {
            menuButton.setStyle("-fx-background-color: #03c2fc; -fx-padding: 5px;");
        }

        // Set the selected button color
        clickedButton.setStyle("-fx-background-color: MediumSeaGreen; -fx-padding: 5px;");

        // Load the corresponding FXML file
        loadFXML(fxmlFileName);
    }
}