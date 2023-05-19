package day46_DailyReviews;

public class Car extends Vehicle{

    private int numOfDoors;

    public Car(String brand, String model, int year, double price, int numOfDoors) {
        super(brand, model, year, price);
        setNumOfDoors(numOfDoors);
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        if (numOfDoors < 2) throw new RuntimeException("Invalid number of doors");
        this.numOfDoors = numOfDoors;
    }

    public void drive() {
        System.out.println(getBrand() + " " + getModel() + " is being driven by the driver");
    }

    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                " numOfDoors=" + numOfDoors +
                '}';
    }
}
