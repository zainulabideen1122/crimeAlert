package com.example.crimealert.controllor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class NavigationController {
    @FXML
    StackPane contentArea;




    public void home(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }

    public void crime(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.print("clicked");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/crimeReport.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }
}
