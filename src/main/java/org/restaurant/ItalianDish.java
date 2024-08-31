package org.restaurant;

public class ItalianDish extends Dish {
    public ItalianDish(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDish() {
        System.out.println("Italian Dish: " + name + ", Price: " + price);
    }
}
