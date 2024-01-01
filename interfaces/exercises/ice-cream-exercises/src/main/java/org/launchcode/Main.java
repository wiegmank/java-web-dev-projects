package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator conesComparator = new ConeComparator();
        cones.sort(conesComparator);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("FLAVORS");
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }

        //cones.sort(comparator);
        System.out.println("\nCONES");
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": $" + cones.get(i).getCost());
            //System.out.println(cones.get(1).getName()+ ": $" + cones.get(1).getCost());
        }
    }
}