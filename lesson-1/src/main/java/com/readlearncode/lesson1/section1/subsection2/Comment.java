package com.readlearncode.lesson1.section1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Comment {

    // Stores the comments message
    private String message;


    /**
     * Formats a comments message.
     *
     * @param format the format to use
     * @return the formatted message
     */
    public String formatMessage(String format){
        return format + message + format;
    }

}