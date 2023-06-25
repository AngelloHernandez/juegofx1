/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.g02.juegofx1.controller;

import java.io.IOException;
import com.g02.juegofx1.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class InicioController {

    @FXML
    private void click_comenzar(ActionEvent event) throws IOException {
        App.setRoot("view/Registro");
    }

    @FXML
    private void click_instrucciones() throws IOException {
        App.setRoot("view/Instrucciones");
    }
}
