package org.launchcode;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private LocalDate menuDate;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
//    public Menu(String restaurantName) {
//        //this.menuDate = menuDate;
//        this.menuItems = menuItems;
//    }

    public LocalDate getMenuDate() {return menuDate;}
    public ArrayList<MenuItem> getRestaurantMenu() {return menuItems;}
    public void setMenuDate(LocalDate menuDate) {this.menuDate = menuDate;}
    public void setRestaurantMenu(ArrayList<MenuItem> restaurantMenu) {this.menuItems = restaurantMenu;}

    //public

    @Override
    public String toString() {
        StringBuilder apps = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                apps.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder entrees = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("entree")) {
                entrees.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nBig Al's Place\n" +
                "--< Apps >--" + apps.toString() + "\n" +
                "--< Entrees >--" + entrees.toString() + "\n" +
                "--< Desserts >--" + desserts.toString();

    }

    //addItem()
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        menuDate = LocalDate.now();
    }

    //removeItem()
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        menuDate = LocalDate.now();
    }

}


