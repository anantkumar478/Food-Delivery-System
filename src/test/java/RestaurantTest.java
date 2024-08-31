import static org.junit.Assert.*;
import org.junit.Test;
import org.restaurant.Dish;
import org.restaurant.DishFactory;
import org.restaurant.Restaurant;

public class RestaurantTest {
    @Test
    public void testAddDish() {
        Restaurant restaurant = new Restaurant("Pasta Palace");
        Dish dish = DishFactory.createDish("Italian", "Spaghetti", 12.0);
        restaurant.addDish(dish);
        assertEquals("Menu size should be 1 after adding one dish", 1, restaurant.getMenu().size());
    }

    @Test
    public void testDishDetails() {
        Dish dish = DishFactory.createDish("Chinese", "Dumplings", 10.0);
        assertEquals("Dumplings", dish.getName());
        assertEquals(10.0, dish.getPrice(), 0.001);
    }
}

