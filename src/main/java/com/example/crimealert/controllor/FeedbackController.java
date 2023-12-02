package com.example.crimealert.controllor;

import com.example.crimealert.businessLayer.SessionManager;
import com.example.crimealert.view.NavigationUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Optional;

public class FeedbackController {
    @FXML
    private TextField feedbackReportHandling;

    @FXML
    private TextField feedbackUserName;

    @FXML
    private TextField feedbackOfficerChats;

    @FXML
    private TextField feedbackApplication;

    @FXML
    private TextArea feedbackComments;

    @FXML
    private void feedbackSubmitHandle(ActionEvent event) {

        if (SessionManager.isLoggedIn() == true)
        {
            String userName = feedbackUserName.getText();
            String reportHandling = feedbackReportHandling.getText();
            String officerChat = feedbackOfficerChats.getText();
            String application = feedbackApplication.getText();
            String comment = feedbackComments.getText();

            if(userName.isEmpty() || reportHandling.isEmpty() || officerChat.isEmpty() || application.isEmpty())
            {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Please fill all the required fields!");
                Optional<ButtonType> result = alert.showAndWait();
            }
            else
            {
                System.out.println("Feedback Submit!");
                feedbackUserName.setText("");
                feedbackReportHandling.setText("");
                feedbackOfficerChats.setText("");
                feedbackApplication.setText("");
                feedbackComments.setText("");
            }

        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "You need to login first!");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                NavigationUtil.navigateToNextWindow("login", (Stage) feedbackComments.getScene().getWindow());
            } else {
                System.out.println("Action canceled.");
            }
        }
    }

}
