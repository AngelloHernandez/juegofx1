package com.g02.juegofx1;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class UtilidadPopUps {

    public static void showCorrectPopup() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                UtilidadPopUps.class.getResource("/com/g02/juegofx1/correctPopup.fxml"));
        Pane popupRoot = loader.load();

        // Crear una nueva ventana emergente
        Stage popupStage = new Stage();

        // Mostrar el popup
        Scene popupScene = new Scene(popupRoot);

        popupStage.setScene(popupScene);
        popupStage.show();

        // Cerrar la ventana emergente después de un corto tiempo
        PauseTransition delay = new PauseTransition(Duration.seconds(1));
        delay.setOnFinished(event -> {
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

        // Mostrar el popup
        Scene popupScene = new Scene(popupRoot);

        popupStage.setScene(popupScene);
        popupStage.show();

        // Cerrar la ventana emergente después de un corto tiempo
        PauseTransition delay = new PauseTransition(Duration.seconds(1));
        delay.setOnFinished(event -> {
            popupStage.close();
        });
        delay.play();
    }
}
