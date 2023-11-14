package com.example.desktop_teacher_panel_app;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.auth.UserRecord;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.auth.oauth2.GoogleCredentials;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateAccountController {


    private FXMLLoader loader;

    @FXML
    private TextField firstName,lastName,email,password,confirmPassword;

    @FXML
    private Button registerButton;
    @FXML
    private void showLoginStage() throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("login_fragment.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        //stage.getIcons().add(new Image("/assets/pngegg.png"));
        stage.show();
        // initializedFirebase();
    }

    public void initialize() {
        registerButton.setOnMouseClicked(event -> {
            String name = firstName.getText();
            String lName = lastName.getText();
            String email1 = email.getText();
            String pass = password.getText();
            String conPass = confirmPassword.getText();


            String emailRegexPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(emailRegexPattern);
            Matcher matcher = pattern.matcher(email1);

            if (name.isEmpty()){
                AlertDialogue.showAlert("FirstName Error","FirstName should not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (lName.isEmpty()) {
                AlertDialogue.showAlert("lastName Error", "lastName should not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (email1.isEmpty()) {
                AlertDialogue.showAlert("Email Error", "email should not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (pass.isEmpty()) {
                AlertDialogue.showAlert("Password Error", "Password should not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (conPass.isEmpty()) {
                AlertDialogue.showAlert("ConfirmPassword Error", "ConfirmPassword should not be empty", Alert.AlertType.WARNING);
                return;
            }
            if (!pass.equals(conPass)){
                AlertDialogue.showAlert("Password Matching Error","Password and ConfirmPassword should be same", Alert.AlertType.WARNING);
                return;
            }
            if (!matcher.matches()){
                AlertDialogue.showAlert("Email is badly formatted", "Email should be formatted", Alert.AlertType.WARNING);
                return;
            }
            if (pass.length() < 8){
                AlertDialogue.showAlert("Password Error", "Password should be minimum 8 characters", Alert.AlertType.WARNING);
                return;
            }

            if (!name.isEmpty() && !lName.isEmpty()
                && !email1.isEmpty() && !pass.isEmpty()
                && !conPass.isEmpty() && matcher.matches()
                && pass.length() >= 8){
                AlertDialogue.showAlert("Success","all fields are filled ", Alert.AlertType.WARNING);
            }
        });
    }

//    private void initializedFirebase() {
//        try {
//            GoogleCredentials credentials = GoogleCredentials.fromStream(
//                    CreateAccountController.class.getResourceAsStream("/google_gson/google-services.json")); // Update the path
//
//            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(credentials)
//                    .setDatabaseUrl("https://your-project-id.firebaseio.com") // Replace with your database URL
//                    .build();
//
//            FirebaseApp.initializeApp(options);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @FXML
//    private void signInUser(){
//        FirebaseAuth auth = FirebaseAuth.getInstance();
//        String  em = email.getText();
//        String pass = password.getText();
//        if (em.isEmpty() && pass.isEmpty()){
//
//        }
//        else {
//            try {
//                UserRecord userRecord = FirebaseAuth.getInstance().getUserByEmail(em);
//            }
//            catch (FirebaseAuthException e){
//                try {
//                    UserRecord.CreateRequest request = new UserRecord.CreateRequest()
//                            .setEmail(em)
//                            .setPassword(pass);
//
//                    UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);
//
//                }
//                catch (FirebaseAuthException createException){
//                    System.out.println("ERROR "+createException.getLocalizedMessage());
//                }
//            }
//        }
//    }

}
