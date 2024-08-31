package org.restaurant;

public class DishFactory {
    public static Dish createDish(String type, String name, double price) {
        if ("Italian".equalsIgnoreCase(type)) {
            return new ItalianDish(name, price);
        } else if ("Chinese".equalsIgnoreCase(type)) {
            return new ChineseDish(name, price);
        } else if ("American".equalsIgnoreCase(type)){
            return new AmericanDish(name, price);
        } else {
            return null;
        }
    }
}

