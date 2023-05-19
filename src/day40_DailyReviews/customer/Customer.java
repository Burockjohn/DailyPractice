package day40_DailyReviews.customer;

public class Customer {

    public String firstName, lastName;
    public int customerID;
    public double balance;

    public Customer(String firstName, String lastName, int customerID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Amount cannot be less than 0 and not equal");
            System.exit(0);
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Amount cannot be less than 0 and not equal");
            System.exit(0);
        }

        if (amount > balance) {
            System.err.println("Withdrawing amount can not be greater than your balance");
            System.exit(0);
        }

        balance -= amount;
    }

    public void showBalance() {
        System.out.println("Your balance is = $" + balance);
    }

    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerID=" + customerID +
                ", balance= $" + balance +
                '}';
    }
}

/*

Create a class named Customer
fields:firstName,lastName,customerId,balance
a constructor: sets all fields
actions:withdraw(controls valid withdrawing),deposit,showBalance,toString

 */