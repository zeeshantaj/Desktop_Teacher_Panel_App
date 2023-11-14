package com.example.desktop_teacher_panel_app;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.w3c.dom.Text;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnnouncementUploadController {

    @FXML
    private ImageView announcementImage;
    private Image placeholderImage;
    @FXML
    private TextField announcementTitle;
    @FXML
    private TextField announcementDueDate;
    @FXML
    private TextField announcementDescription;
    @FXML
    private Button announcementUploadBtn;

    public void initialize() {
        // Load placeholder image (replace with your placeholder image path)
        placeholderImage = new Image("/images/announcement_img.jpg");
        announcementImage.setImage(placeholderImage);

        // Set click event handler for the ImageView
        announcementImage.setOnMouseClicked(event ->
                openFileChooser());

        announcementUploadBtn.setOnMouseClicked(event -> {
            String title = announcementTitle.getText();
            String dueDate = announcementDueDate.getText();
            String des = announcementDescription.getText();

            String regexPattern = "^\\d{2}/\\d{2}/\\d{4}$";
            Pattern pattern = Pattern.compile(regexPattern);

            // Create a Matcher instance
            Matcher matcher = pattern.matcher(dueDate);


            if (title.isEmpty() && dueDate.isEmpty()){
                AlertDialogue.showAlert("Empty Filed","Please fill the title", Alert.AlertType.WARNING);
                return;
            }
            if (dueDate.isEmpty()){
                AlertDialogue.showAlert("Empty Filed","Please fill the due date", Alert.AlertType.WARNING);
                return;

            }
            if (!matcher.matches()){
                AlertDialogue.showAlert("Empty Filed","due date should be in this formate (dd/mm/yyyy)", Alert.AlertType.WARNING);
                return;
            }
            if (!title.isEmpty() && !dueDate.isEmpty() && matcher.matches()){
                AlertDialogue.showAlert("title and due date is filled","Please fill the title", Alert.AlertType.WARNING);
            }
        });



    }
    private void openFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Image File");
        // Set the initial directory or any other preferences for the file chooser
        // fileChooser.setInitialDirectory(new File("path/to/external/drive"));

        // Add supported file extensions for image files
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif");
        fileChooser.getExtensionFilters().add(imageFilter);

        // Show the file chooser dialog and let the user choose an image file
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            // Load the selected image and set it to the ImageView
            Image selectedImage = new Image(selectedFile.toURI().toString());
            announcementImage.setImage(selectedImage);
        }
    }

}
