package org.launchcode;
import java.util.Date;
//import comparator

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;

    private Date dateAdded;
    private boolean isNew;
    public MenuItem(String name, double price, String description, String category, Date dateAdded, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
        this.isNew = isNew;
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

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean getIsNew() {
        return isNew;
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

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String printInfo(){
        //add logic here to compare dateAdded to current date to evaluate isNew
        if (this.isNew) {
            return (this.name + " costs $" + this.price + " - NEW!");
        } else {
            return (this.name + " costs $" + this.price);
        }
    }



}
