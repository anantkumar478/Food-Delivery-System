package org.restaurant;

public class ChineseDish extends Dish {
    public ChineseDish(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDish() {
        System.out.println("Chinese Dish: " + name + ", Price: " + price);
    }
}
