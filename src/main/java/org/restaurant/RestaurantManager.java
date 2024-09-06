package org.restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantManager {
    private static volatile RestaurantManager instance;
    private Map<String, Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new HashMap<>();
    }

    // here we have used double-checked locking to minimize synchronization overhead
    public static RestaurantManager getInstance() {
        if (instance == null) {
            synchronized (RestaurantManager.class) {
                if (instance == null) {
                    instance = new RestaurantManager();
                }
            }
        }
        return instance;
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

    public void removeRestaurant(String name) {
        restaurants.remove(name);
    }

    public void updateRestaurant(String oldName, Restaurant newRestaurant) {
        if (restaurants.containsKey(oldName)) {
            restaurants.put(oldName, newRestaurant);
        }
    }
}

