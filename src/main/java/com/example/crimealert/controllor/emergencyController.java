package com.example.crimealert.controllor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class emergencyController {
    @FXML
    private void emergencyButton(ActionEvent event) {
        System.out.println("Emergency!");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Your current location and 5 pictures are sent to police!");
        alert.showAndWait();
    }
}
