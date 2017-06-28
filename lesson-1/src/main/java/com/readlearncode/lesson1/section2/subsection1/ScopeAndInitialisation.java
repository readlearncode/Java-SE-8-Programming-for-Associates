package com.readlearncode.lesson1.section2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ScopeAndInitialisation {

    public void DetermineIfVotable(int age){
        int adult = 18;
        boolean canVote;
        if( age >= adult){
            canVote = true;
        } else {
            canVote = false;
        }
        System.out.println(canVote);
    }





}