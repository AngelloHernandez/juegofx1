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
    private List<Question> quiz = new ArrayList<>();
    
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
        question3.set_question("¿Cómo se escribe rojo en inglés?");
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

        //Pregunta 5
        Question question5 = new Question();
        question5.set_question("¿Qué paradigma de programación permite trabajar con clases y objetos?");
        List<String> answers5 = new ArrayList<>();
        answers5.add("Lógico");
        answers5.add("Funcional");
        answers5.add("Orientado a Objetos");
        answers5.add("Ninguna de las Anteriores");
        question5.set_answers(answers5);
        question5.set_right(2);
        quiz.add(question5);

        //Pregunta 6
        Question question6 = new Question();
        question6.set_question("¿Cuál es el resultado de potenciar 2 a la 5?");
        List<String> answers6 = new ArrayList<>();
        answers6.add("32");
        answers6.add("10");
        answers6.add("25");
        answers6.add("30");
        question6.set_answers(answers6);
        question6.set_right(0);
        quiz.add(question6);

        //Pregunta 7
        Question question7 = new Question();
        question7.set_question("¿Cuál es el verbo to be del pronombre 'He'?");
        List<String> answers7 = new ArrayList<>();
        answers7.add("Are");
        answers7.add("Him");
        answers7.add("Is");
        answers7.add("It");
        question7.set_answers(answers7);
        question7.set_right(2);
        quiz.add(question7);

        //Pregunta 8
        Question question8 = new Question();
        question8.set_question("¿En qué año finalizó la II Guerra Mundial?");
        List<String> answers8 = new ArrayList<>();
        answers8.add("1954");
        answers8.add("1945");
        answers8.add("1964");
        answers8.add("1918");
        question8.set_answers(answers8);
        question8.set_right(1);
        quiz.add(question8);

        //Pregunta 9
        Question question9 = new Question();
        question9.set_question("¿Qué operador lógico se usa para la conjunción en JAVA?");
        List<String> answers9 = new ArrayList<>();
        answers9.add("==");
        answers9.add("+");
        answers9.add("||");
        answers9.add("&&");
        question9.set_answers(answers9);
        question9.set_right(3);
        quiz.add(question9);

        //Pregunta 10
        Question question10 = new Question();
        question10.set_question("¿Qué palabra califica o le da una cualidad al sustantivo?");
        List<String> answers10 = new ArrayList<>();
        answers10.add("Predicado");
        answers10.add("Adjetivo");
        answers10.add("Adverbio");
        answers10.add("Pronombre");
        question10.set_answers(answers10);
        question10.set_right(1);
        quiz.add(question10);

        //Pregunta 11
        Question question11 = new Question();
        question11.set_question("¿Quién fue Edgar Alla Poe?");
        List<String> answers11 = new ArrayList<>();
        answers11.add("Un actor");
        answers11.add("Un pintor");
        answers11.add("Un escritor");
        answers11.add("Un personaje ficticio");
        question11.set_answers(answers11);
        question11.set_right(2);
        quiz.add(question11);

        //Pregunta 12
        Question question12 = new Question();
        question12.set_question("¿Cuál es la capital de EE.UU?");
        List<String> answers12 = new ArrayList<>();
        answers12.add("New York");
        answers12.add("Chicago");
        answers12.add("Los Ángeles");
        answers12.add("Washington D.C");
        question12.set_answers(answers12);
        question12.set_right(3);
        quiz.add(question12);

        //Pregunta 13
        Question question13 = new Question();
        question13.set_question("¿Cuál de las siguientes es una estructura de datos?");
        List<String> answers13 = new ArrayList<>();
        answers13.add("if & else");
        answers13.add("Tablas Hash");
        answers13.add("For");
        answers13.add("Arrays AVL");
        question13.set_answers(answers13);
        question13.set_right(1);
        quiz.add(question13);

        //Pregunta 14
        Question question14 = new Question();
        question14.set_question("¿Quién pintó 'La Mona Lisa'?");
        List<String> answers14 = new ArrayList<>();
        answers14.add("Miguel Angel");
        answers14.add("Pablo Picasso");
        answers14.add("Vincent Van Gogh");
        answers14.add("Leonardo Da Vinci");
        question14.set_answers(answers14);
        question14.set_right(3);
        quiz.add(question14);

        //Pregunta 15
        Question question15 = new Question();
        question15.set_question("¿Cómo se dice tío en inglés?");
        List<String> answers15 = new ArrayList<>();
        answers15.add("Nephew");
        answers15.add("Dad");
        answers15.add("Uncle");
        answers15.add("Aunt");
        question15.set_answers(answers15);
        question15.set_right(2);
        quiz.add(question15);

        //Pregunta 16
        Question question16 = new Question();
        question16.set_question("¿Cuál es el país de orígen de la marca Ferrari?");
        List<String> answers16 = new ArrayList<>();
        answers16.add("Italia");
        answers16.add("Francia");
        answers16.add("Estados Unidos");
        answers16.add("Alemania");
        question16.set_answers(answers16);
        question16.set_right(0);
        quiz.add(question16);

        //Pregunta 17
        Question question17 = new Question();
        question17.set_question("¿Cuáles de las siguientes es una propiedad del Box Model en CSS?");
        List<String> answers17 = new ArrayList<>();
        answers17.add("Text Align");
        answers17.add("Position");
        answers17.add("Background Color");
        answers17.add("Padding");
        question17.set_answers(answers17);
        question17.set_right(3);
        quiz.add(question17);

        //Pregunta 18
        Question question18 = new Question();
        question18.set_question("¿Cual de los siguientes es un lenguaje de Pseudocódigo?");
        List<String> answers18 = new ArrayList<>();
        answers18.add("JavaScript");
        answers18.add("Python");
        answers18.add("Java");
        answers18.add("Ninguno de los anteriores");
        question18.set_answers(answers18);
        question18.set_right(3);
        quiz.add(question18);

        //Pregunta 19
        Question question19 = new Question();
        question19.set_question("¿Quién fue el Vocalista de la banda Queen?");
        List<String> answers19 = new ArrayList<>();
        answers19.add("Abel Tesfaye");
        answers19.add("Freddie Mercury");
        answers19.add("John Lennon");
        answers19.add("Michael Jackson");
        question19.set_answers(answers19);
        question19.set_right(1);
        quiz.add(question19);

        //Pregunta 20
        Question question20 = new Question();
        question20.set_question("¿Quién escribió '100 Años de Soledad'?");
        List<String> answers20 = new ArrayList<>();
        answers20.add("J.K Rowling");
        answers20.add("William Shakespeare");
        answers20.add("Gabriel García Marquez");
        answers20.add("Eduardo Mendoza");
        question20.set_answers(answers20);
        question20.set_right(2);
        quiz.add(question20);

        //Pregunta 21
        Question question21 = new Question();
        question21.set_question("¿Cada cuánto se realizan los Juegos Olímpicos?");
        List<String> answers21 = new ArrayList<>();
        answers21.add("Cada 2 Años");
        answers21.add("Cada 4 Años");
        answers21.add("Cada 6 Años");
        answers21.add("Todos los años");
        question21.set_answers(answers21);
        question21.set_right(1);
        quiz.add(question21);

        //Pregunta 22
        Question question22 = new Question();
        question22.set_question("¿Qué equipo ganó el mundial de la FIFA en 2014?");
        List<String> answers22 = new ArrayList<>();
        answers22.add("Brasil");
        answers22.add("Argentina");
        answers22.add("España");
        answers22.add("Alemania");
        question22.set_answers(answers22);
        question22.set_right(3);
        quiz.add(question22);

        //Pregunta 23
        Question question23 = new Question();
        question23.set_question("¿A qué reino pertenecen los hongos?");
        List<String> answers23 = new ArrayList<>();
        answers23.add("Fungi");
        answers23.add("Monera");
        answers23.add("Vegetal");
        answers23.add("Animal");
        question23.set_answers(answers23);
        question23.set_right(0);
        quiz.add(question23);

        //Pregunta 24
        Question question24 = new Question();
        question24.set_question("El número PI es:");
        List<String> answers24 = new ArrayList<>();
        answers24.add("2.2111");
        answers24.add("3.1416");
        answers24.add("4");
        answers24.add("3.3333");
        question24.set_answers(answers24);
        question24.set_right(1);
        quiz.add(question24);

        //Pregunta 25
        Question question25 = new Question();
        question25.set_question("¿Cuáles son los lenguajes base en el desarrollo web?");
        List<String> answers25 = new ArrayList<>();
        answers25.add("XML, CSS, Python");
        answers25.add("Java, PHP, Pseint");
        answers25.add("HTML, Python, NodeJS");
        answers25.add("HTML, CSS, JavaScript");
        question25.set_answers(answers25);
        question25.set_right(3);
        quiz.add(question25);

        //Pregunta 26
        Question question26 = new Question();
        question26.set_question("Es la mezcla del lenguaje natural con alguna convenciones de lenguajes de programación:");
        List<String> answers26 = new ArrayList<>();
        answers26.add("Diagramas de Flujo");
        answers26.add("Variables");
        answers26.add("Pseudocódigo");
        answers26.add("Funciones");
        question26.set_answers(answers26);
        question26.set_right(2);
        quiz.add(question26);

        //Pregunta 27
        Question question27 = new Question();
        question27.set_question("¿Cuanto es 49 dividido entre 7?");
        List<String> answers27 = new ArrayList<>();
        answers27.add("4");
        answers27.add("2");
        answers27.add("7");
        answers27.add("12");
        question27.set_answers(answers27);
        question27.set_right(2);
        quiz.add(question27);

        //Pregunta 28
        Question question28 = new Question();
        question28.set_question("¿Qué significan las siglas PSP?");
        List<String> answers28 = new ArrayList<>();
        answers28.add("Personal Software Process");
        answers28.add("Prompt Service Page");
        answers28.add("Partition Send Preview");
        answers28.add("Print Screen Progress");
        question28.set_answers(answers28);
        question28.set_right(0);
        quiz.add(question28);

        //Pregunta 29
        Question question29 = new Question();
        question29.set_question("¿Comó se escribe 200 en inglés");
        List<String> answers29 = new ArrayList<>();
        answers29.add("Two Thousand");
        answers29.add("Two Hundred");
        answers29.add("Two Millions");
        answers29.add("Ninguna de las anteriores");
        question29.set_answers(answers29);
        question29.set_right(1);
        quiz.add(question29);

        //Pregunta 30
        Question question30 = new Question();
        question30.set_question("¿Como se llamó al periodo de alternancia política entre el partido Liberal y el Conservador en Colombia?");
        List<String> answers30 = new ArrayList<>();
        answers30.add("La Gran Depresión");
        answers30.add("Golpe Militar de Rojas Pinilla");
        answers30.add("El Bogotazo");
        answers30.add("Frente Nacional");
        question30.set_answers(answers30);
        question30.set_right(3);
        quiz.add(question30);
    }
    
    public List<Question> get_quiz(){
        Collections.shuffle(quiz);
        return quiz;
    }
            
    

}
