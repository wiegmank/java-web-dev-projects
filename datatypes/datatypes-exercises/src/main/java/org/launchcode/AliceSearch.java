package org.launchcode;

import java.util.Scanner;
public class AliceSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";

        System.out.println("Enter a term to search you would like to search for within the intro to 'Alice's Adventures in Wonderland': ");

        String storyLowercase = story.toLowerCase();
        String userWord = input.nextLine().toLowerCase();

        int index = story.indexOf(userWord);
        int length = userWord.length();

        if (storyLowercase.contains(userWord)) {
            System.out.println("That IS in the 1st sentence and is located at index " + index + ". The length of the word is " + length + " characters.");
        } else {
            System.out.println("That word IS NOT in the 1st sentence.");
        }

        String storyUpdated = story.replace(userWord, "");
        System.out.println(storyUpdated);
    }
}
