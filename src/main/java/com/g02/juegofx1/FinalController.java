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
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FinalController implements Initializable {

    @FXML
    private Label nombreJugador;
    @FXML
    private Label puntosJugador;
    @FXML
    private Label totalPreguntas;
    @FXML
    private Label preguntasCorrectas;
    @FXML
    private Label puntosJugadorParcial;
    @FXML
    private Label preguntasIncorrectas;
    @FXML
    private Label puntosJugadorTotal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Integer finalScore = App.user.get_score();
        Integer Correctas = App.user.get_right_questions();
        Integer Incorrectas = App.user.get_failed_questions();
        nombreJugador.setText(App.user.get_user_name());
        puntosJugador.setText( finalScore + " Puntos");
        totalPreguntas.setText(""+(Correctas+Incorrectas));
        preguntasCorrectas.setText(""+Correctas);
        preguntasIncorrectas.setText(""+Incorrectas);
        puntosJugadorParcial.setText(finalScore + " Pts");
        puntosJugadorTotal.setText(finalScore + " Pts");
    }

    @FXML
    private void click_nuevo_intento(ActionEvent event) throws IOException{
        App.setRoot("Registro");
        App.user.clear_user();
    }

    @FXML
    private void click_salir(ActionEvent event) throws IOException{
        App.setRoot("Inicio");
        App.user.clear_user();
    }
}