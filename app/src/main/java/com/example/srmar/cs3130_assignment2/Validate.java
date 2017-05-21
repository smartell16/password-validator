package com.example.srmar.cs3130_assignment2;

/**
 * Created by srmar on 2017-05-21.
 */

public class Validate {

    String password = "password";

    public void setPassword (String password){
        this.password = password;
    }

    public String getPassword (){
        return password;
    }

    public boolean Validate(String password){
        if(password.equals("password")) {
            System.out.println("Your password cannot be the word 'password'.");
            return false;
        }
        if(password.length() < 8){
            System.out.println("Your password must be 8 characters or longer.");
            return false;
        }
        else{
            System.out.println("Your password is strong.");
            return true;
        }

    }

}
