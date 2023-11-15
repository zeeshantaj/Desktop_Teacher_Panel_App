package com.example.desktop_teacher_panel_app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ClassHistoryController {

    private ObservableList<String> items;
    private ListView<String> listView;
    private TextField newItemField;
    private int editIndex = -1; // Initialize to -1
    public void initialize() {
        items = FXCollections.observableArrayList();
        listView = new ListView<>(items);
        newItemField = new TextField();
        Button addButton = new Button("Add");
        Button removeButton = new Button("Remove");
        Button editButton = new Button("Edit");

        addButton.setOnAction(event -> {
            String newItem = newItemField.getText();
            if (!newItem.isEmpty()) {
                if (editIndex != -1) {
                    items.set(editIndex, newItem); // Edit existing item
                    editIndex = -1; // Reset edit index
                } else {
                    items.add(newItem); // Add new item
                }
                newItemField.clear();
            }
        });
        HBox inputBox = new HBox(10);
        inputBox.getChildren().addAll(newItemField, addButton, removeButton, editButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(inputBox, listView);

        Scene scene = new Scene(root, 400, 300);

    }
}
