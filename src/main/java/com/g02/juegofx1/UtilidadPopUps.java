package com.g02.juegofx1;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class UtilidadPopUps {

    public static void showCorrectPopup() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                UtilidadPopUps.class.getResource("/com/g02/juegofx1/correctPopup.fxml"));
        Pane popupRoot = loader.load();

        // Crear una nueva ventana emergente
        Stage popupStage = new Stage();

        // Remueve el marco de la ventana
        popupStage.initStyle(StageStyle.UNDECORATED);

        popupStage.initStyle(StageStyle.TRANSPARENT);

        popupStage.initModality(Modality.APPLICATION_MODAL);

        // Crear un efecto de desenfoque (blur) para la ventana principal
        BoxBlur blur = new BoxBlur(10, 10, 3);

        Stage primaryStage = (Stage) App.scene.getWindow();

        // Aplicar el efecto de desenfoque a la ventana principal
        primaryStage.getScene().getRoot().setEffect(blur);

        // Mostrar el popup
        Scene popupScene = new Scene(popupRoot);
        popupScene.setFill(Color.TRANSPARENT);
        popupStage.setScene(popupScene);
        popupStage.show();

        // Cerrar la ventana emergente después de un corto tiempo
        PauseTransition delay = new PauseTransition(Duration.seconds(1));
        delay.setOnFinished(event -> {
            // Restaurar la escena y eliminar el efecto de desenfoque de la ventana principal
            primaryStage.getScene().getRoot().setEffect(null);
            popupStage.close();
        });
        delay.play();

    }

    public static void showIncorrectPopup() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                UtilidadPopUps.class.getResource("/com/g02/juegofx1/IncorrectPopup.fxml"));
        Pane popupRoot = loader.load();

        // Crear una nueva ventana emergente
        Stage popupStage = new Stage();

        // Remueve el marco de la ventana
        popupStage.initStyle(StageStyle.UNDECORATED);

        popupStage.initStyle(StageStyle.TRANSPARENT);

        popupStage.initModality(Modality.APPLICATION_MODAL);

         // Crear un efecto de desenfoque (blur) para la ventana principal
        BoxBlur blur = new BoxBlur(10, 10, 3);

        Stage primaryStage = (Stage) App.scene.getWindow();

        // Aplicar el efecto de desenfoque a la ventana principal
        primaryStage.getScene().getRoot().setEffect(blur);

        // Mostrar el popup
        Scene popupScene = new Scene(popupRoot);

        popupStage.setScene(popupScene);
        popupStage.show();

        // Cerrar la ventana emergente después de un corto tiempo
        PauseTransition delay = new PauseTransition(Duration.seconds(1));
        delay.setOnFinished(event -> {
            // Restaurar la escena y eliminar el efecto de desenfoque de la ventana principal
            primaryStage.getScene().getRoot().setEffect(null);
            popupStage.close();
        });
        delay.play();
    }
}
