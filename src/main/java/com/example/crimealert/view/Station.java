package com.example.crimealert.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Station extends Application {
    double x,y =0;
@Override
    public void start(Stage stage) throws IOException {
    BorderPane root =FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
            "/com/example/crimealert/view/station.fxml")));
    root.setOnMousePressed(mouseEvent -> {
        x = mouseEvent.getSceneX();
        y = mouseEvent.getSceneY();
    });
    root.setOnMouseDragged(mouseEvent -> {
        stage.setX(mouseEvent.getX()-x);
        stage.setY(mouseEvent.getX()-y);

    });
    stage.setTitle("Crime Alert");
    stage.setScene(new Scene(root,780,620));
    stage.show();
}
public static void main(String[] args){
    launch(args);
}
}
