package day46_DailyReviews;

public class Vehicle {

    private String brand, model;
    private int year;
    private double price;

    public Vehicle(String brand, String model, int year, double price) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank()) {
            throw new RuntimeException("Invalid brand name");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank()) {
            throw new RuntimeException("Invalid model name");
        }
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1800) {
            System.err.println("Invalid year");
            System.exit(0);
        }
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public void startEngine() {
        System.out.println(getBrand() + " "  + getModel() + " is started");
    }

    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
