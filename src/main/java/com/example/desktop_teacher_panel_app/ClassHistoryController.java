package com.example.desktop_teacher_panel_app;

import com.example.desktop_teacher_panel_app.Model.DetailsClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ClassHistoryController {

    @FXML
    ListView<DetailsClass> meetingListView = new ListView<>();

    public void initialize() {
        // Sample meetings

        DetailsClass detailsClass = new DetailsClass("zeeshan taj","math","BSSE","new Building conference 1"
                ,"geometry","123");
        DetailsClass detailsClass1 = new DetailsClass("zeeshan taj","math","BSSE","new Building conference 1"
                ,"geometry","11123");


// Add meetings to the ListView
        meetingListView.getItems().addAll(detailsClass,detailsClass1);

// Create a cell factory to display items in multiple columns
        meetingListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(DetailsClass modelClass, boolean empty) {
                super.updateItem(modelClass, empty);

                if (empty || modelClass == null) {
                    setText(null);
                } else {
                    // Display meeting details in multiple columns
                    setText("Teacher: " + modelClass.getTeacherName() +
                            ", Class: " + modelClass.getClassLocation() +
                            ", Topic: " + modelClass.getTodayTopic() +
                            ", Subject: " + modelClass.getSubjectName() +
                            ", Minutes: " + modelClass.getMinutes());
                }
            }
        });

    }
}
