package com.example.desktop_teacher_panel_app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    //private final Connection con;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button loginButton;

    Window window;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void showRegisterStage() throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("create_account.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Registration");
        //stage.getIcons().add(new Image("/assets/pngegg.png"));
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
            //  stage.getIcons().add(new Image("/asset/icon.png"));
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void getInfo() {

        System.out.println("name:"+username.getText());
        System.out.println("password:"+password.getText());
        //  JFXToast.makeText(primaryStage, "I'm Super Sayan", JFXToast.LONG, JFXToast.BUTTON);
    }
}