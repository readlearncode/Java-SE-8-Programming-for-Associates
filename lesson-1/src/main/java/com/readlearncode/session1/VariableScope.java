package com.readlearncode.session1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class VariableScope {

    public static int GLOBAL_SCOPE = 1_000;

    private float classScope = 10.0f;

    public void scopeMethod(String localScopeString){

        byte localScopeByte = 120;
        String localScopeInstance = new String("Hello");

        if(true){
            double localScopeDouble = 10.50d;
        }

        {
            char localScopeChar = 'X';
        }

    }
}