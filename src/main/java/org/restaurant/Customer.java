package org.restaurant;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void viewMenus(RestaurantManager manager) {
        manager.displayAllMenus();
    }

    public void orderDishFromRestaurant(RestaurantManager manager, String restaurantName, String dishName) {
        Restaurant restaurant = manager.getRestaurant(restaurantName);
        if (restaurant != null) {
            for (Dish dish : restaurant.getMenu()) {
                if (dish.getName().equalsIgnoreCase(dishName)) {
                    System.out.println(name + " ordered " + dishName + " from " + restaurantName);
                    return;
                }
            }
            System.out.println(dishName + " is not available at " + restaurantName);
        } else {
            System.out.println("Restaurant " + restaurantName + " not found");
        }
    }

    public void askForMenu(String restaurantName) {
        RestaurantManager manager = new RestaurantManager();
        Restaurant restaurant = manager.getRestaurant(restaurantName);
        if (restaurant != null) {
            System.out.println("Menu for " + restaurantName + ":");
            restaurant.displayMenu();
        } else {
            System.out.println("Restaurant named " + restaurantName + " does not exist.");
        }
    }
}

