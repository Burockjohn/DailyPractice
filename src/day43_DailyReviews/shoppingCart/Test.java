package day43_DailyReviews.shoppingCart;

public class Test {

    public static void main(String[] args) {

        Product product1 = new Product("Salatalık", 14.95, 2);
        Product product2 = new Product("Domates", 18.99, 3);
        Product product3 = new Product("Elma", 12.95, 2);
        Product product4 = new Product("Armut", 24.95, 1);
        Product product5 = new Product("50'lik pimaş boru", 99.99, 11);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.addProduct(product4);
        shoppingCart.addProduct(product5);

        System.out.println(shoppingCart); //5

        shoppingCart.removeProduct("DOMATES");

        System.out.println(shoppingCart); //4

        System.out.println("total price of your shopping cart " + shoppingCart.totalPrice());


    }
}

/*

Create a class named Test with a main method that demonstrates how to use the Product and ShoppingCart classes to add,
remove, and calculate the total price of products in a shopping cart.

 */