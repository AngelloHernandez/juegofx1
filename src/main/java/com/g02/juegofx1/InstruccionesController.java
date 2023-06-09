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

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class InstruccionesController implements Initializable{
       
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
     @FXML
     void click_volver(ActionEvent event) throws IOException{
        App.setRoot("Inicio");
    }
    
}
