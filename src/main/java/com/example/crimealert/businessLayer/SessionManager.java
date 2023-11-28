package com.example.crimealert.businessLayer;
import com.example.crimealert.businessLayer.classes.User;
import javafx.scene.control.Alert;

public class SessionManager {
    private static User loggedInUser;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User user) {
        loggedInUser = user;
    }

    public static void logout() {
        loggedInUser = null;
    }

    public static boolean isLoggedIn()
    {
        return loggedInUser != null;
    }


    private static LoginService.UserType userType;

    public static LoginService.UserType getUserType() {
        return userType;
    }

    public static void setUserType(LoginService.UserType userType) {
        SessionManager.userType = userType;
    }
    public static void showLoginAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Login Required");
        alert.setHeaderText("You need to log in to perform this action.");
        alert.setContentText("Please log in to access this feature.");
        alert.showAndWait();
    }
}
