package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;

        do {
            System.out.println("Enter a radius (greater than 0): ");
            while (!input.hasNextDouble()) {
                System.out.println("That doesn't look like a valid number. Please try again.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius<0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
        input.close();
    }
}