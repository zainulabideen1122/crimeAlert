package com.example.crimealert.businessLayer;
import com.example.crimealert.businessLayer.classes.User;

public class SessionManager {
    private static User loggedInUser;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User user) {
        loggedInUser = user;
    }

    public static void clearSession() {
        loggedInUser = null;
    }


    private static LoginService.UserType userType;

    public static LoginService.UserType getUserType() {
        return userType;
    }

    public static void setUserType(LoginService.UserType userType) {
        SessionManager.userType = userType;
    }
}
