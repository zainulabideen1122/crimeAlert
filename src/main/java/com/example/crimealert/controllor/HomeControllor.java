package com.example.crimealert.controllor;
import com.example.crimealert.businessLayer.SessionManager;
import com.example.crimealert.businessLayer.classes.User;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class HomeControllor {
    @FXML
    private Text name;
    @FXML
    private Text email;
    @FXML
    private Text cnic;
    @FXML
    private Text address;
    @FXML
    private Text contact;

    @FXML
    public void initialize() {
        // Retrieve user from the SessionManager
        User user = SessionManager.getLoggedInUser();

        // Set user data in Text fields
        if (user != null) {
            name.setText(user.getName());
            email.setText(user.getEmail());
            cnic.setText(String.valueOf(user.getCnic()));
            address.setText(user.getAddress());
            contact.setText(String.valueOf(user.getContact()));
        }
        else
        {
            System.out.println("You need to login first!");
            name.setText("Null");
            email.setText("Null");
            cnic.setText("Null");
            address.setText("Null");
            contact.setText("Null");
        }
    }
}
