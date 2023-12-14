package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Wings", "Smoked Chicken Wings", 15.99, "appetizer");
        MenuItem item2 = new MenuItem("Chips & Guac", "Tortilla Chips & Smashed Avocados", 8.99, "appetizer");
        MenuItem item3 = new MenuItem("Black Bean Burger", "Meat-free burger & fries (v)", 12.99, "entree");
        MenuItem item4 = new MenuItem("Street Tacos", "2 Chicken Tacos", 9.99, "entree");
        MenuItem item5 = new MenuItem("Cookie", "Chocolate Chip Cookie", 2.99, "dessert");
        MenuItem item6 = new MenuItem("Ice Cream", "Cone w/ 1 scoop of Vanilla ", 2.99, "dessert");

        Menu sampleMenu = new Menu();

        sampleMenu.addItem(item1);
        sampleMenu.addItem(item2);
        sampleMenu.addItem(item3);
        sampleMenu.addItem(item4);
        sampleMenu.addItem(item5);
        sampleMenu.addItem(item6);

        System.out.println(sampleMenu);

        System.out.println(item1);

        sampleMenu.removeItem(item1);
        System.out.println(sampleMenu);
    }
}