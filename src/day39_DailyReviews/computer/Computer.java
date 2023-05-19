package day39_DailyReviews.computer;

public class Computer {

    public String brand, cpu;
    public double price;

    public boolean isOpened = false;

    public Computer(String brand, String cpu, double price) {
        this.brand = brand;
        this.cpu = cpu;
        this.price = price;
    }

    public void open() {
        isOpened = true;
        System.out.println(brand + " is being started");
    }

    public void close() {
        isOpened = false;
        System.out.println(brand + " is being closed");
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", price=" + price +
                "," +((isOpened)? " PC is open" : " Pc is closed") +
                '}';
    }
}

/*

Create a class named Computer
Instance variables: brand, cpu, price,isOpened
A constructor:sets all fields
Actions:open, close,restart,toString

Create a class named TestComputer with a main method

Create 5 Computer objects and open all of them
And then close ones which has i3 cpu
Print opened computers

 */