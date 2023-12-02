package com.example.crimealert.controllor;
import com.example.crimealert.businessLayer.ReportManager;
import com.example.crimealert.businessLayer.SessionManager;
import com.example.crimealert.businessLayer.classes.Report;
import com.example.crimealert.view.NavigationUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

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


        if(SessionManager.isLoggedIn() == true)
        {
            String subject = subjectTextField.getText();
            String place = placeTextField.getText();
            String description = descriptionTextArea.getText();
//            System.out.println("Subject: " + subject);
//            System.out.println("Place: " + place);
//            System.out.println("Description: " + description);

            if(subject.isEmpty() || place.isEmpty() || description.isEmpty())
            {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Please fill all the required fields!");
                Optional<ButtonType> result = alert.showAndWait();
            }
            else
            {
                boolean submitResult = ReportManager.submitReport(subject, place, description, "evidence", SessionManager.getLoggedInUser().getId());
                if(submitResult == true)
                {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Report submitted successfully!");
                    alert.showAndWait();
                    System.out.println("Submitted!");
                    subjectTextField.setText("");
                    placeTextField.setText("");
                    descriptionTextArea.setText("");
                }
                else
                {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Report didn't submitted successfully! Please try again!");
                    alert.showAndWait();
                }

            }
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "You need to login first!");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                NavigationUtil.navigateToNextWindow("login", (Stage) placeTextField.getScene().getWindow());
            } else {
                System.out.println("Action canceled.");
            }
        }

    }

    public void printSomething(ActionEvent actionEvent) {
        System.out.println("test");
    }
}