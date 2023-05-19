package day38_DailiyReviews.car;

public class Car {

    public String brand;
    public int year;
    public double price;
    public boolean isStarted;

    public Car(String brand, int year, double price, boolean isStarted) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.isStarted = isStarted;
    }

    public void start() {
        System.out.println(brand + " is started");
    }

    public void stop() {
        System.out.println(brand + " is stopped");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

/*

Create a class named Car
Instances: brand,  year, price,isStarted
A constructor :sets all fields
Actions:start,stop,toString

 */