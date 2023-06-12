/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g02.juegofx1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Quiz {
    private static List<Question> quiz = new ArrayList<>();
    
    public void initialize_quiz(){
        //Pregunta 1
        Question question1 = new Question();
        question1.set_question("¿Cuánto es 5 x 8?");
        List<String> answers1 = new ArrayList<>();
        answers1.add("40");
        answers1.add("20");
        answers1.add("35");
        answers1.add("45");
        question1.set_answers(answers1);
        question1.set_right(0);
        quiz.add(question1);
        
        //Pregunta 2
        Question question2 = new Question();
        question2.set_question("¿Quién descubrió América?");
        List<String> answers2 = new ArrayList<>();
        answers2.add("Simón Bolivar");
        answers2.add("Gabriel García Márquez");
        answers2.add("Vicente Fernández");
        answers2.add("Cristóbal Colón");
        question2.set_answers(answers2);
        question2.set_right(3);
        quiz.add(question2);
        
        //Pregunta 3
        Question question3 = new Question();
        question3.set_question("¿Cómo es rojo en inglés?");
        List<String> answers3 = new ArrayList<>();
        answers3.add("Blue");
        answers3.add("Tree");
        answers3.add("Red");
        answers3.add("Dog");
        question3.set_answers(answers3);
        question3.set_right(2);
        quiz.add(question3);
        
        //Pregunta 4
        Question question4 = new Question();
        question4.set_question("¿Cuál de los siguientes animales es carnívoro?");
        List<String> answers4 = new ArrayList<>();
        answers4.add("Elefante");
        answers4.add("Lobo");
        answers4.add("Mariposa");
        answers4.add("Tortuga");
        question4.set_answers(answers4);
        question4.set_right(1);
        quiz.add(question4);
                
    }
    
    public List<Question> get_quiz(){
        Collections.shuffle(quiz);
        return quiz;
    }
            
    

}
