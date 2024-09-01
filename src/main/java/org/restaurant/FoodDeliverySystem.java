package org.restaurant;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        RestaurantManager manager = RestaurantManager.getInstance();

        // Create Restaurants
        manager.addRestaurant(new Restaurant("Pasta Palace"));
        manager.addRestaurant(new Restaurant("Great Wall"));
        manager.addRestaurant(new Restaurant("Burgers Bonanza"));

        // Add Dishes using correct enum usage
        manager.getRestaurant("Pasta Palace").addDish(DishFactory.createDish(DishFactory.DishType.Italian, "Spaghetti Carbonara", 15.0));
        manager.getRestaurant("Pasta Palace").addDish(DishFactory.createDish(DishFactory.DishType.Italian, "Penne Arrabbiata", 12.0));

        manager.getRestaurant("Great Wall").addDish(DishFactory.createDish(DishFactory.DishType.Chinese, "Kung Pao Chicken", 14.0));
        manager.getRestaurant("Great Wall").addDish(DishFactory.createDish(DishFactory.DishType.Chinese, "Chow Mein", 11.0));

        manager.getRestaurant("Burgers Bonanza").addDish(DishFactory.createDish(DishFactory.DishType.American, "Cheeseburger", 9.0));
        manager.getRestaurant("Burgers Bonanza").addDish(DishFactory.createDish(DishFactory.DishType.American, "Veggie Burger", 8.0));

        // Customer Interactions
        Customer customer = new Customer("Alice");
        customer.viewMenus(manager);
        customer.orderDishFromRestaurant(manager, "Great Wall", "Chow Mein");
        customer.orderDishFromRestaurant(manager, "Burgers Bonanza", "Fish Burger");  // Dish not available
    }
}