/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g02.juegofx1;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Question {
    
    private String question;
    private List<String> answers;
    private Integer rightAnswer;
    
    public void set_question(String newQuestion){
        this.question = newQuestion;
    }
    
    public String get_question(){
        return this.question;
    }
    
    public void set_answers(List<String> newAnswers){
        this.answers = newAnswers;
    }
    
    public List<String> get_answers(){
        return this.answers;
    }
    
    public void set_right(Integer index){
        this.rightAnswer = index;
    }
    public Boolean validate_right(Integer index){
        return Objects.equals(index, this.rightAnswer);
    }
    
}
