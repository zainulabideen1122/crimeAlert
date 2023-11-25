package com.example.crimealert.controllor;

import com.example.crimealert.businessLayer.SignupService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField nameField;

    @FXML
    private TextField addressField;
    @FXML
    private TextField cnicField;
    @FXML
    private TextField contactField;

    private SignupService signupService = new SignupService();

    @FXML
    private ChoiceBox<String> genderChoiceBox;

    @FXML
    private void initialize() {
        // Populate the genderChoiceBox with options
        genderChoiceBox.getItems().addAll("Select an option", "Male", "Female", "Other");
        // Set the default value
        genderChoiceBox.setValue("Select an option");
    }

    @FXML
    private void onRegisterButtonClick() {
        String name = nameField.getText();
        String email = emailField.getText();
        int cnic = Integer.parseInt(cnicField.getText());
        int contact = Integer.parseInt(contactField.getText());
        String address = addressField.getText();
        String gender = genderChoiceBox.getValue();
        String password = passwordField.getText();

        boolean registrationSuccess = signupService.registerCitizen(name, email,password, cnic, contact, address, gender );

        if (registrationSuccess) {
            System.out.println("Citizen registration successful!");
            // Add navigation or other actions on successful registration
        } else {
            System.out.println("Citizen registration failed. Please try again.");
            // Handle the case where registration fails
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}