package day40_DailyReviews.customer;

public class TestCustomer {

    public static void main(String[] args) {

        Customer customer = new Customer("Burak", "Can", 64, 0);
        customer.deposit(500);
        customer.deposit(1250);
        customer.withdraw(250);

        customer.showBalance();

        System.out.println(customer);


    }
}

/*

Create a class named TestCustomer with a main method
Create a customer and call withdraw and deposit methods a few times
Call showBalance method
Print the customer object

 */