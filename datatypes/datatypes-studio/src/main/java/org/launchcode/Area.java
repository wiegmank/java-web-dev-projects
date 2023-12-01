package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();


        while (userInput == "") {
            System.out.println("Enter the radius of the circle: ");
        };


//        Double radius = input.nextDouble();
//        while (input < 0 || input.equals("")) {
//        System.out.println("Enter the radius of the circle: ");
//        radius = input.nextDouble();

        }
        Double userRadius = 0;
        Double PI = Math.PI;
        Double area = Circle.getArea(userRadius);

        System.out.println("The AREA of the circle is " + area + ".");
    }
}
