package org.restaurant;

public class DishFactory {

    public enum DishType {
        Italian,
        Chinese,
        American
    }

    public static Dish createDish(DishType type, String name, double price) throws IllegalArgumentException {
        switch (type) {
            case Italian:
                return new ItalianDish(name, price);

            case Chinese:
                return new ChineseDish(name, price);

            case American:
                return new AmericanDish(name, price);

            default:
                throw new IllegalArgumentException("Invalid Dish Type");
        }
    }
}
