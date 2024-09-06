package org.restaurant;

public class AmericanDish extends Dish {
    public AmericanDish(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDish() {
        System.out.println("American Dish: " + name + ", Price: " + price);
    }
}

