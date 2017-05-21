package com.example.srmar.cs3130_assignment2;

import java.util.*;

/**
 * Created by srmar on 2017-05-21.
 */

public class Validate {

    String password = "password";
    int testNum = 2; //number of tests passed.

    public void setPassword (String password){
        this.password = password;
    }

    public String getPassword (){
        return password;
    }

    public boolean Validate(String password){
        //stage 1
        if(password.equals("password")) {
            System.out.println("Your password cannot be the word 'password'.");
            testNum--;
        }
        //stage 1
        else if(password.length() < 8){
            System.out.println("Your password must be 8 characters or longer.");
            testNum--;
        }
        else{
            System.out.println("Your password is strong.");
            System.out.println("Your password passed "+testNum+" test(s).\n");
            return true;
        }
        System.out.println("Your password passed "+testNum+" test(s).\n");
        return false;

    }

}
