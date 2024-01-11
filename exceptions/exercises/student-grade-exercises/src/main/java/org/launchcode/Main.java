package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println("1 divided by 0 is " + Divide(1,0));
        System.out.println("4 divided by 5 is " + Divide(4,5));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println("Carl got " + CheckFileExtension(studentFiles.get("Carl")) + " points.");
        System.out.println("Brad got " + CheckFileExtension(studentFiles.get("Brad")) + " points.");


    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        double numX = x;
        double numY = y;
        double grade;
        if (numY == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        grade = numX/numY;
        return grade;
    }



    public static int CheckFileExtension(String fileName)
    // Write code here!
    {
        int score = 0;
        //no file attached = -1 point
        if (fileName.isEmpty() || fileName.isBlank() || fileName == null) {
            score -= 1;
            try {
                throw new Exception("No file attached");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return score;
        }

        //wrong extension = 0 points
        if (!fileName.endsWith(".java")) {
            score = 0;
            return score;
        }

        //correct = +1 point
        if (fileName.endsWith(".java")) {
            score += 1;
        }
        return score;
    }

}

