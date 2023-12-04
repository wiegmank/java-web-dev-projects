package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;

        System.out.println("Enter students below (or ENTER to finish)...");

        do {
            System.out.println("Student name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("ID #: ");
                Integer newStudentNumber = input.nextInt();
                students.put(newStudentNumber, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nStudent Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID # " + student.getKey() + " = " + student.getValue());
        }
        System.out.println("Number of Students in Roster: " + students.size());

    }
}
