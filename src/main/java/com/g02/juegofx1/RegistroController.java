/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.g02.juegofx1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistroController implements Initializable {

    @FXML
    private TextField inputName;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void iniciar_juego(ActionEvent event) throws IOException {
        if (inputName != null) {
            String texto = inputName.getText();
            App.user.set_user_name(texto);
            System.out.println("Nombre del usuario: " + App.user.get_user_name());
            App.setRoot("Preguntas");
        }
    }
    
}
