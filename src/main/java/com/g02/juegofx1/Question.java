/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g02.juegofx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Question {
    
    private static String question;
    private static List<String> answers;
    private static Integer rightAnswer;
    
    public void set_question(String newQuestion){
        question = newQuestion;
    }
    
    public String get_question(){
        return question;
    }
    
    public void set_answers(List<String> newAnswers){
        answers = newAnswers;
    }
    
    public List<String> get_answers(){
        return answers;
    }
    
    public void set_right(Integer index){
        rightAnswer = index;
    }
    public Boolean validate_right(Integer index){
        return Objects.equals(index, rightAnswer);
    }
    
}
