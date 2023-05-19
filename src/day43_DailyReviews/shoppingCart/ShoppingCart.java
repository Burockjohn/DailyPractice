package day43_DailyReviews.shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(p-> p.getName().equalsIgnoreCase(name));
    }

    public double totalPrice() {
        double result = 0;
        for (Product product : products) {
            result += product.getTotalPrice();
        }

        return result;
    }

    public String toString() {
        return "ShoppingCart{" +
                "´Number of products=" + products.size() +
                '}';
    }
}

/*

Create a class named ShoppingCart with an ArrayList of Product objects as a private instance variable.
Create methods for adding a product to the shopping cart, removing a product from the shopping cart,
and getting the total price of all products in the shopping cart.

 */