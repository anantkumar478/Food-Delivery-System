package org.restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantManager {
    private Map<String, Restaurant> restaurants;

    // Constructor to initialize the restaurant map
    public RestaurantManager() {
        restaurants = new HashMap<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getName(), restaurant);
    }

    public Restaurant getRestaurant(String name) {
        return restaurants.get(name);
    }

    public void displayAllMenus() {
        for (Restaurant restaurant : restaurants.values()) {
            restaurant.displayMenu();
        }
    }

    public void addNewDishToRestaurant(String restaurantName, Dish dish) {
        Restaurant restaurant = restaurants.get(restaurantName);
        if (restaurant != null) {
            restaurant.addDish(dish);
            System.out.println("Added " + dish.getName() + " to " + restaurantName);
        } else {
            System.out.println("Restaurant named " + restaurantName + " does not exist.");
        }
    }

    public void removeRestaurant(String name) {
        restaurants.remove(name);
    }

    public void updateRestaurant(String oldName, Restaurant newRestaurant) {
        if (restaurants.containsKey(oldName)) {
            restaurants.put(oldName, newRestaurant);  // Replaces the restaurant instance under the existing name
        }
    }
}
