package com.example.crimealert.controllor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CrimeReportController {

    @FXML
    private TextField subjectTextField;

    @FXML
    private TextField placeTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Button submitButton;

    @FXML
    private Label titleLabel;

    @FXML
    private Button selectFileButton;

    @FXML
    private void handleSubmitButton(ActionEvent event) {
        System.out.println("test");
//        String subject = subjectTextField.getText();
//        String place = placeTextField.getText();
//        String description = descriptionTextArea.getText();
//        System.out.println("Subject: " + subject);
//        System.out.println("Place: " + place);
//        System.out.println("Description: " + description);
    }

    public void printSomething(ActionEvent actionEvent) {
        System.out.println("test");
    }
}