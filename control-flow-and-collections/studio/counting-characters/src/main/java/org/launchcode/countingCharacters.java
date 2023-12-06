package org.launchcode;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.*;
public class countingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> characterCount = new HashMap<>();

        System.out.println("Enter a string: ");
        String myStringOriginal = input.nextLine();

        String myString = myStringOriginal.toLowerCase();
        char[] myChars = myString.toCharArray();

        for (char myChar : myChars) {
            //if no counter exists, create one
            if (Character.isLetter(myChar)) {
                if (characterCount.containsKey(myChar)) {
                    characterCount.put(myChar, characterCount.get(myChar) + 1);
                } //else, counter exists, increment by 1
                else {
                characterCount.put(myChar, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> myChar : characterCount.entrySet()) {
            System.out.println(myChar.getKey() + ": " + myChar.getValue());
        }
    }
}
