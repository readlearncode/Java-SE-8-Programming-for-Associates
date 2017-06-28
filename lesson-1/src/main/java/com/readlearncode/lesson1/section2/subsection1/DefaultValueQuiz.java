package com.readlearncode.lesson1.section2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class DefaultValueQuiz {
    int points = 10;
    int bonus;
    public void calculate(){
        int total = 100;
        total = points + bonus;
    }
}