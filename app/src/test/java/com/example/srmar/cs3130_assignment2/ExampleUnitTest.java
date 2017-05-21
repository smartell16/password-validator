package com.example.srmar.cs3130_assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    String p1 = "password";
    String p2 = "passwd";
    String p3 = "csci3130";
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
        assertTrue(v1.Validate(p3) == true);
    }
}