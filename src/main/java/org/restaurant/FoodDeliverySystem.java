package org.restaurant;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        Restaurant italianRestaurant = new Restaurant("Italian Bistro");

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
        customer.askForMenu("Italian Bistro");
        customer.viewMenus(manager);
        customer.orderDishFromRestaurant(manager, "Great Wall", "Chow Mein");
        customer.orderDishFromRestaurant(manager, "Burgers Bonanza", "Fish Burger");  // Dish not available


        // Manager adding restaurant to system
        manager.addRestaurant(italianRestaurant);

        // Manager adds dishes
        Dish spaghetti = new Dish("Spaghetti", 12) {
            @Override
            public void displayDish() {
            }
        };
        manager.addNewDishToRestaurant("Italian Bistro", spaghetti);

        // Adding another dish
        Dish lasagna = new Dish("Lasagna", 15) {
            @Override
            public void displayDish() {

            }
        };
        manager.addNewDishToRestaurant("Italian Bistro", lasagna);

        // Customer asking for updated menu
        customer.askForMenu("Italian Bistro");
    }
}