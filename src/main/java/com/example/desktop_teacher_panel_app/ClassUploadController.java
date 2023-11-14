package com.example.desktop_teacher_panel_app;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClassUploadController {

    @FXML
    private TextField teacherName;
    @FXML
    private TextField subjectName;
    @FXML
    private TextField department;
    @FXML
    private TextField classLocation;
    @FXML
    private TextField todayTopic;
    @FXML
    private TextField keyText;
    @FXML
    private TextField minute;
    @FXML
    private Button classUploadBtn;
    public void initialize() {

        classUploadBtn.setOnMouseClicked(event -> {
            String teacher = teacherName.getText();
            String depart = department.getText();
            String sub = subjectName.getText();
            String location = classLocation.getText();
            String topic = todayTopic.getText();
            String key = keyText.getText();
            String minutes = minute.getText();
            if (teacher.isEmpty()){
                AlertDialogue.showAlert("Empty Filed","teacher name is empty", Alert.AlertType.WARNING);
                return;
            }
            if (depart.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "department is empty", Alert.AlertType.WARNING);
                return;
            }
            if (sub.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "subject is empty", Alert.AlertType.WARNING);
                return;
            }
            if (location.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "location is empty", Alert.AlertType.WARNING);
                return;
            }
            if (topic.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "topic is empty", Alert.AlertType.WARNING);
                return;
            }
            if (key.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "key is empty", Alert.AlertType.WARNING);
                return;
            }
            if (minutes.isEmpty()) {
                AlertDialogue.showAlert("Empty Filed", "minute is empty", Alert.AlertType.WARNING);
                return;
            }

            if (!teacher.isEmpty() && !depart.isEmpty()
                && !sub.isEmpty() && !location.isEmpty()
                && !topic.isEmpty() && !key.isEmpty()
                && !minutes.isEmpty()){
                AlertDialogue.showAlert("success","all filed filled ", Alert.AlertType.WARNING);
            }

        });

    }
}
