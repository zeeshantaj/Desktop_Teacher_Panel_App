package com.example.desktop_teacher_panel_app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginController  {
    //private final Connection con;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Button loginButton;

    @FXML
    private void showRegisterStage() throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("create_account.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("User Registration");
        stage.show();
    }


    @FXML
    private void showHomeContent() {

        try {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("main_home_content.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Admin Panel");
            stage.show();


        }
        catch (Exception e){
            AlertDialogue.showAlert("Error ","Stage Error \n" +e.getLocalizedMessage(), Alert.AlertType.WARNING);
        }
    }
    public void initialize() {

        loginButton.setOnMouseClicked(event -> {
            String email1 = email.getText();
            String pass = password.getText();

            String emailRegexPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(emailRegexPattern);
            Matcher matcher = pattern.matcher(email1);


            if (email1.isEmpty()){
                AlertDialogue.showAlert("Email is Empty","Email can not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (pass.isEmpty()) {
                AlertDialogue.showAlert("password is Empty","password can not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (!matcher.matches()) {
                AlertDialogue.showAlert("Email is badly formatted", "Email should be formatted", Alert.AlertType.WARNING);
                return;
            }
            if (!email1.isEmpty() && !pass.isEmpty()
                && matcher.matches() && pass.length() >= 8){

            }

        });
    }
}