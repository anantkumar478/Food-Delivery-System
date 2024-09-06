import static org.junit.Assert.*;
import org.junit.Test;
import org.restaurant.Dish;
import org.restaurant.DishFactory;
import org.restaurant.Restaurant;
import org.restaurant.RestaurantManager;

public class RestaurantTest {

    @Test
    public void testAddDish() {
        Restaurant restaurant = new Restaurant("Pasta Palace");
        Dish dish = DishFactory.createDish(DishFactory.DishType.valueOf("Italian"), "Spaghetti", 12.0);
        restaurant.addDish(dish);
        assertEquals("Menu size should be 1 after adding one dish", 1, restaurant.getMenu().size());
    }

    @Test
    public void testDishDetails() {
        Dish dish = DishFactory.createDish(DishFactory.DishType.valueOf("Chinese"), "Dumplings", 10.0);
        assertEquals("Dumplings", dish.getName());
        assertEquals(10.0, dish.getPrice(), 0.001);
    }

    @Test
    public void testAddAndGetRestaurant() {
        RestaurantManager manager = new RestaurantManager();  // Changed to direct instantiation
        Restaurant restaurant = new Restaurant("Grill House");
        manager.addRestaurant(restaurant);

        Restaurant fetchedRestaurant = manager.getRestaurant("Grill House");
        assertEquals("Restaurant fetched should be the same as the one added", restaurant, fetchedRestaurant);
    }

    @Test
    public void testDisplayAllMenus() {
        RestaurantManager manager = new RestaurantManager();  // Changed to direct instantiation
        Restaurant italianRestaurant = new Restaurant("Italian Bistro");
        Restaurant chineseRestaurant = new Restaurant("Chinese Corner");

        manager.addRestaurant(italianRestaurant);
        manager.addRestaurant(chineseRestaurant);

        manager.displayAllMenus();
        // In this test, we assume displayMenu() prints the menus. Normally, you'd capture console output or mock the display behavior.
    }

    @Test
    public void testRemoveRestaurant() {
        RestaurantManager manager = new RestaurantManager();  // Changed to direct instantiation
        Restaurant testRestaurant = new Restaurant("Test Diner");
        manager.addRestaurant(testRestaurant);

        assertNotNull("Restaurant should exist before removal", manager.getRestaurant("Test Diner"));
        manager.removeRestaurant("Test Diner");
        assertNull("Restaurant should not exist after removal", manager.getRestaurant("Test Diner"));
    }

    @Test
    public void testUpdateRestaurant() {
        RestaurantManager manager = new RestaurantManager();  // Changed to direct instantiation
        Restaurant oldRestaurant = new Restaurant("Diner");
        manager.addRestaurant(oldRestaurant);

        Restaurant newRestaurant = new Restaurant("New Diner");
        manager.updateRestaurant("Diner", newRestaurant);
        assertSame("Updated restaurant should be the new restaurant object", newRestaurant, manager.getRestaurant("Diner"));
        assertSame("Old restaurant name should still point to the updated object", newRestaurant, manager.getRestaurant("Diner"));
    }
}
