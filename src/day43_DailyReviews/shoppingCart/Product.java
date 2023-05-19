package day43_DailyReviews.shoppingCart;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    //--------------------------//


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //------------------------------//


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("No way");
            System.exit(1);
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("You have nothing");
        }
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

/*

Create a class named Product with private instance variables for the product's name, price, and quantity.
Create a constructor that takes the name, price, and quantity as parameters and sets them as the instance variables.
Create methods for getting and setting the name, price, and quantity of the product.
Create a method named getTotalPrice that calculates and returns the total price of the product based on its price and quantity.

 */
