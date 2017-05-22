package com.example.srmar.cs3130_assignment2;

/**
 * Created by srmar on 2017-05-21.
 */

public class Validate {

    String password = "password";
    int testNum = 5;

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
        if(password.length() < 8){
            System.out.println("Your password must be 8 characters or longer.");
            testNum--;
        }
        //stage 2
        if(password.matches("[[!a-z]0-9_]+") || password.matches("[[!A-Z]0-9_]+")){
            System.out.println("Your password must contain both upper and lower case characters.");
            testNum--;
        }
        //stage 2
        if(!password.matches(".*[0-9]+.*")){
            System.out.println("Your password must contain at least one number.");
            testNum--;
        }
        //stage 2
        if(!password.matches(".*_.*")){
            System.out.println("Your password must contain at least one underscore (_).");
            testNum--;
        }
        if(testNum == 5){
            System.out.println("Your password is strong.");
            System.out.println("Your password passed "+testNum+" test(s).\n");
            return true;
        }
        System.out.println("Your password passed "+testNum+" test(s).\n");
        return false;
    }

}
