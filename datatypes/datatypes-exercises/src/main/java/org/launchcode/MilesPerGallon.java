package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive: ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas was consumed: ");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("The fuel economy of your last trip was " + mpg + " miles per gallon.");
    }
}
