package com.example.crimealert.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationUtil {
    public static void navigateToNextWindow(String windowName, Stage currentStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(NavigationUtil.class.getResource(windowName + ".fxml"));
            Parent root = fxmlLoader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));

            // Close the current stage
            currentStage.close();

            // Show the new stage
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
