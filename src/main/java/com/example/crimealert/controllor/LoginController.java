package com.example.crimealert.controllor;

import com.example.crimealert.businessLayer.LoginService;
import com.example.crimealert.view.NavigationUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;



    private LoginService loginService = new LoginService();

    @FXML
    protected void onLoginButtonClick() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (loginService.authenticateUser(email, password)) {
            // Navigate to the next window or perform other actions on successful login
//            NavigationUtil.navigateToNextWindow("next");
            System.out.println("Login successful!");
            NavigationUtil.navigateToNextWindow("station", (Stage) emailField.getScene().getWindow());
        } else {
//            statusLabel.setText("Invalid email or password");
            System.out.println("Login Unsuccessful!");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}