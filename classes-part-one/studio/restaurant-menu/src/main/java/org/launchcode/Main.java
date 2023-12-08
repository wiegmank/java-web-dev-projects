package org.launchcode;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem wings = new MenuItem("Wings", 1.00, "Spicy", "Appetizer", new Date(), true);

//        System.out.println(wings.getName() + " " + wings.getDescription() + " " + wings.getCategory() + " " + " " + wings.getDateAdded() + " " + wings.getPrice() + " " + wings.);

        System.out.println(Menu.title);
        System.out.println(wings.printInfo());

    }


}
