package org.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Dish> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public void displayMenu() {
        System.out.println("--- " + name + " Menu ---");
        for (Dish dish : menu) {
            dish.displayDish();
        }
    }

    public String getName() {
        return name;
    }

    public List<Dish> getMenu() {
        return menu;
    }
}