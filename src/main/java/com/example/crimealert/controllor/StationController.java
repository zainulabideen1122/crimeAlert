package com.example.crimealert.controllor;

import com.example.crimealert.businessLayer.SessionManager;
import com.example.crimealert.view.NavigationUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StationController {
    @FXML
    StackPane contentArea;
    @FXML
    private Label pageTitleLabel;
    @FXML
    private Button  loginBtn;

    @FXML
    private Button logoutBtn;


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
    public void initialize() throws IOException {
        //setPageTitle("Home");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/Citizen/home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        //contentArea.getScene().setRoot(fxml);
        updateLoginLogoutButtons();

    }


    private void updateLoginLogoutButtons() {
        boolean isLoggedIn = SessionManager.isLoggedIn();
        loginBtn.setVisible(!isLoggedIn);
        logoutBtn.setVisible(isLoggedIn);
    }

    public void LoginBtnClicked() throws IOException {
        NavigationUtil.navigateToNextWindow("login", (Stage) loginBtn.getScene().getWindow());
    }

    public void LogoutBtnClicked() throws IOException {
        SessionManager.logout();
        updateLoginLogoutButtons();
        NavigationUtil.navigateToNextWindow("station", (Stage) loginBtn.getScene().getWindow());
    }

    public void home(javafx.event.ActionEvent actionEvent) throws IOException {
        //setPageTitle("Home");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/Citizen/home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
    }

    public void crime(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.print("clicked");
        //setPageTitle("Report Crime");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/Citizen/crimeReport.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

        //contentArea.getScene().setRoot(fxml);
    }

    public void emergency(javafx.event.ActionEvent actionEvent) throws IOException {
        //setPageTitle("Report Crime");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/Citizen/emergency.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

        //contentArea.getScene().setRoot(fxml);
    }

    public void feedback(javafx.event.ActionEvent actionEvent) throws IOException {
        //setPageTitle("Report Crime");
        Parent fxml = FXMLLoader.load(getClass().getResource("/com/example/crimealert/view/Citizen/feedback.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

        //contentArea.getScene().setRoot(fxml);
    }




}
