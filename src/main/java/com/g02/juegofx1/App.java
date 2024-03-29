package com.g02.juegofx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.g02.juegofx1.model.User;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Scene scene;
    public static User user;

    @Override
    public void start(Stage stage) throws IOException {
        user = new User();
        scene = new Scene(loadFXML("view/Inicio"), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}