package org.restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantManager {
    private static RestaurantManager instance;
    private Map<String, Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new HashMap<>();
    }

    public static synchronized RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
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
}

