/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.g02.juegofx1.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.g02.juegofx1.App;
import com.g02.juegofx1.model.Question;
import com.g02.juegofx1.model.Quiz;
import com.g02.juegofx1.model.UtilidadPopUps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class PreguntasController implements Initializable {

    private List<Question> currQuiz;
    private Question currQuestion;
    private Integer globalIndex = 0;
    @FXML
    private Label nombreJugador;
    @FXML
    private Label puntosJugador;
    @FXML
    private Label preguntaJugador;
    @FXML
    private Button respuesta_1;
    @FXML
    private Button respuesta_2;
    @FXML
    private Button respuesta_3;
    @FXML
    private Button respuesta_4;
    @FXML
    private Label NumPregunta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Quiz quiz = new Quiz();
        quiz.initialize_quiz();
        currQuiz = quiz.get_quiz();
        next_question(globalIndex);
    }

    @FXML
    private void click_respuesta_1(ActionEvent event) throws IOException {
        if (currQuestion.validate_right(0)) {
            App.user.update_score(100);
            App.user.add_right_question();
            UtilidadPopUps.showCorrectPopup();
        } else {
            App.user.add_failed_question();
            UtilidadPopUps.showIncorrectPopup();
        }
        next_question(globalIndex);
    }

    @FXML
    private void click_respuesta_2(ActionEvent event) throws IOException {
        if (currQuestion.validate_right(1)) {
            App.user.update_score(100);
            App.user.add_right_question();
            UtilidadPopUps.showCorrectPopup();

        } else {
            App.user.add_failed_question();
            UtilidadPopUps.showIncorrectPopup();

        }
        next_question(globalIndex);
    }

    @FXML
    private void click_respuesta_3(ActionEvent event) throws IOException {
        if (currQuestion.validate_right(2)) {
            App.user.update_score(100);
            App.user.add_right_question();
            UtilidadPopUps.showCorrectPopup();
        } else {
            App.user.add_failed_question();
            UtilidadPopUps.showIncorrectPopup();

        }
        next_question(globalIndex);
    }

    @FXML
    private void click_respuesta_4(ActionEvent event) throws IOException {
        if (currQuestion.validate_right(3)) {
            App.user.update_score(100);
            App.user.add_right_question();
            UtilidadPopUps.showCorrectPopup();
        } else {
            App.user.add_failed_question();
            UtilidadPopUps.showIncorrectPopup();

        }
        next_question(globalIndex);

    }

    private void next_question(Integer index) {

        if (index < currQuiz.size()) {
            globalIndex = (globalIndex + 1);
            currQuestion = currQuiz.get(index);
            NumPregunta.setText("PREGUNTA #"+globalIndex+"/"+App.user.get_difficulty());
            nombreJugador.setText(App.user.get_user_name());
            puntosJugador.setText(App.user.get_score() + " Puntos");
            preguntaJugador.setText(currQuestion.get_question());
            respuesta_1.setText(currQuestion.get_answers().get(0));
            respuesta_2.setText(currQuestion.get_answers().get(1));
            respuesta_3.setText(currQuestion.get_answers().get(2));
            respuesta_4.setText(currQuestion.get_answers().get(3));
        } else {
            try {
                App.setRoot("view/Final");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}

