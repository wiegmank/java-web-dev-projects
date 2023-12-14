package org.launchcode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
//import comparator


public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;
    //private boolean isNew; per carrie
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 30;
    }

    @Override
    public String toString() {
        //String myString = isNew() ? "   *** NEW ***" : "";
        String myString = "";
        if (isNew()) {
            myString = "### NEW ###";
        } else {
            myString = "";
        }
        return String.format("%s - %s... $%s" + myString,this.name, this.description, this.price);
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());
    }

}
