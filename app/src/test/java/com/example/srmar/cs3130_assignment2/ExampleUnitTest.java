package com.example.srmar.cs3130_assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String p1 = "password";
    String p2 = "passwd";
    String p3 = "csci3130";
    String p4 = "PASSWORD";
    String p5 = "Pa_5W0rD";
    Validate v1 = new Validate();

    @Test
    public void password_validation1()throws Exception {
        assertTrue(v1.Validate(p1) == false);
    }

    @Test
    public void password_validation2()throws Exception {
        assertTrue(v1.Validate(p2) == false);
    }

    @Test
    public void password_validation3()throws Exception {
        assertTrue(v1.Validate(p3) == false);
    }

    @Test
    public void password_validation4()throws Exception {
        assertTrue(v1.Validate(p4) == false);
    }

    @Test
    public void password_validation5()throws Exception {
        assertTrue(v1.Validate(p5) == true);
    }
}