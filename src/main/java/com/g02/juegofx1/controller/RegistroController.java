/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.g02.juegofx1.controller;

import java.io.IOException;
import com.g02.juegofx1.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistroController{

    @FXML
    private TextField inputName;
    @FXML
    private ToggleGroup toggleDifGroup;
    @FXML
    private RadioButton aprendizToggle;
    @FXML
    private RadioButton academicoToggle;
    @FXML
    private RadioButton genioToggle;

    @FXML
    private void iniciar_juego(ActionEvent event) throws IOException {
        if (inputName != null) {
            aprendizToggle.setUserData("Aprendiz");
            academicoToggle.setUserData("Académico");
            genioToggle.setUserData("Genio");
            App.user.set_difficulty(toggleDifGroup.getSelectedToggle().getUserData().toString());
            String texto = inputName.getText();
            App.user.set_user_name(texto);
            System.out.println("Nombre del usuario: " + App.user.get_user_name());
            App.setRoot("view/Preguntas");
        }
    }
}
