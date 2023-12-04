package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int evenSum = 0;
        for (int i : arr) {
            if (i%2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }

    public static void wordFives(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word length: ");
        int wordLength = input.nextInt();

        for (String i : arr) {
            if (i.length() == wordLength) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);

        System.out.println(sumEven(myArrayList));

        ArrayList<String> myWords = new ArrayList<>();
        myWords.add("Books");
        myWords.add("Magazines");
        myWords.add("Water");
        myWords.add("Tea");

        wordFives(myWords);
    }
}
