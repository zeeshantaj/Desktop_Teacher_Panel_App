package com.example.desktop_teacher_panel_app;

import com.example.desktop_teacher_panel_app.Model.DetailsClass;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.css.Size;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClassHistoryController {

    @FXML
    ListView<DetailsClass> meetingListView = new ListView<>();
    public ListView<DetailsClass> getMeetingListView(){
        return meetingListView;
    }

    public void initialize() {
        // Sample meetings

        DetailsClass[] detailsClasses = {
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "123"),
                new DetailsClass("zeeshan taj", "math", "BSSE", "new Building conference 1", "geometry", "11123")
        };
// Add meetings to the ListView

            meetingListView.getItems().addAll(detailsClasses);

        Label countLabel = new Label(); // Label to display the count


        countLabel.setFont(Font.font(14));
        countLabel.setTranslateX(350); // Adjust position (x-coordinate) as needed
        countLabel.setTranslateY(5);  // Adjust position (y-coordinate) as needed

        // Update the count label whenever the list changes


// Create a cell factory to display items in multiple columns
        meetingListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(DetailsClass meeting, boolean empty) {
                super.updateItem(meeting, empty);

                if (empty || meeting == null) {
                    setGraphic(null);
                    setText(null);
                } else {
                    VBox cell = new VBox(5);

                    cell.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, CornerRadii.EMPTY, null)));
                    cell.setPadding(new javafx.geometry.Insets(10));
                    cell.setMaxWidth(500);
                    cell.setMaxHeight(500);

                    double textSize = 17.0;
                    Font font = new Font(textSize);


                    Text teacher = new Text("Teacher: " + meeting.getTeacherName());
                    teacher.setFont(font);
                    Text className = new Text("Class: " + meeting.getClassLocation());
                    className.setFont(font);
                    Text topic = new Text("Topic: " + meeting.getTodayTopic());
                    topic.setFont(font);
                    Text subject = new Text("Subject: " + meeting.getSubjectName());
                    subject.setFont(font);
                    Text minutes = new Text("Minutes: " + meeting.getMinutes());
                    minutes.setFont(font);


                    Text countTxt = new Text("No: "+meetingListView.getItems().size());
                    countTxt.setStyle("-fx-background-color: #ffffff; -fx-border-color: black; -fx-padding: 3px;");

                    cell.getChildren().addAll(teacher, className, topic, subject, minutes,countTxt);
                    setGraphic(cell);
                }
            }
        });


    }
}
