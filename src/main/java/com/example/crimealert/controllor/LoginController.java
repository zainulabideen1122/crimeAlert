package com.example.crimealert.controllor;

import com.example.crimealert.businessLayer.LoginService;
import com.example.crimealert.businessLayer.LoginService.*;
import com.example.crimealert.businessLayer.SessionManager;
import com.example.crimealert.businessLayer.classes.*;
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
        UserType userType = UserType.CITIZEN;
        User user = loginService.authenticateUser(email, password, userType);

        if (user != null) {
            // Navigate to the next window or perform other actions on successful login
//            NavigationUtil.navigateToNextWindow("next");
            System.out.println("Login successful!");
            SessionManager.setLoggedInUser(user);
            SessionManager.setUserType(userType);
            if(SessionManager.getLoggedInUser().isLoggedIn)
            {
                System.out.println(SessionManager.getUserType());

                NavigationUtil.navigateToNextWindow("station", (Stage) emailField.getScene().getWindow());
            }
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