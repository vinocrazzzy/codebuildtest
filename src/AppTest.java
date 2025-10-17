package com.example.codebuild;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for the simple App.
 * These tests will be executed by CodeBuild during the 'test' phase.
 */
public class AppTest 
{
    private App app = new App();

    @Test
    public void testGetGreetingWithName()
    {
        String name = "AWS";
        String expected = "Hello, AWS!";
        String actual = app.getGreeting(name);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetGreetingWithoutName()
    {
        String expected = "Hello, World!";
        String actual = app.getGreeting("");
        assertEquals(expected, actual);
    }
}
