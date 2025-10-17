package com.example.codebuild;

/**
 * A simple application class with a function to test.
 * This class will be compiled and packaged by CodeBuild.
 */
public class App 
{
    // A simple public function that we can test
    public String getGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    public static void main( String[] args )
    {
        App app = new App();
        System.out.println( app.getGreeting("CodeBuild User") );
    }
}
