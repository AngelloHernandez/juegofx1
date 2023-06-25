/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g02.juegofx1;

/**
 *
 * @author Usuario
 */
public class User {
    private static String name = "";
    private static Integer score = 0;
    private static Integer rightQuestions = 0;
    private static Integer failedQuestions = 0;
    private static Integer Difficulty = 0;

    public void set_difficulty(String difficulty) {
        switch (difficulty) {
            case "Aprendiz":
                Difficulty = 10;
                break;
            case "Académico":
                Difficulty = 15;
                break;
            case "Genio":
                Difficulty = 20;
                break;
            default:
                Difficulty = 10;
        }
    }

    public Integer get_difficulty() {
        return Difficulty;
    }

    public void set_user_name(String newName) {
        name = newName;
    }

    public String get_user_name() {
        return name;
    }

    public void update_score(Integer addScore) {
        score = (score + addScore);
    }

    public Integer get_score() {
        return score;
    }

    public void add_right_question() {
        rightQuestions = (rightQuestions + 1);
    }

    public Integer get_right_questions() {
        return rightQuestions;
    }

    public void add_failed_question() {
        failedQuestions = (failedQuestions + 1);
    }

    public Integer get_failed_questions() {
        return failedQuestions;
    }

    public void clear_user() {
        name = "";
        score = 0;
        rightQuestions = 0;
        failedQuestions = 0;
        Difficulty = 0;
    }
}
