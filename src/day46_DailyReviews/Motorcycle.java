package day46_DailyReviews;

public class Motorcycle extends Vehicle{

    private int engineSize;

    public Motorcycle(String brand, String model, int year, double price, int engineSize) {
        super(brand, model, year, price);
        setEngineSize(engineSize);
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        if (engineSize < 0) throw new RuntimeException("Invalid engine size");
        this.engineSize = engineSize;
    }

    public void wheelie() {
        System.out.println("Where is the front wheel of my motorcycle");
    }

    public String toString() {
        return "Motorcycle{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                " engineSize=" + engineSize +
                '}';
    }
}
