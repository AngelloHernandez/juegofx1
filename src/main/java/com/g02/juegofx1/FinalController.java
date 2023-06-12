/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.g02.juegofx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FinalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("Nombre: "+App.user.get_user_name());
        System.out.println("Correctas: "+App.user.get_right_questions());
        System.out.println("Incorrectas: "+App.user.get_failed_questions());
        System.out.println("Puntaje :"+App.user.get_score());
    }    
    
}
