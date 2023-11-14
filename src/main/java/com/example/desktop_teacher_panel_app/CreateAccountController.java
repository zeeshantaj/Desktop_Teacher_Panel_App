package com.example.desktop_teacher_panel_app;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.auth.UserRecord;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.auth.oauth2.GoogleCredentials;

import java.io.IOException;

public class CreateAccountController {


    private FXMLLoader loader;

    @FXML
    private TextField firstName,lastName,email,userName,password,confirmPassword;

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
