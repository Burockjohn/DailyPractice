package day46_DailyReviews;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String brand, String model) {
        vehicles.removeIf(p -> p.getBrand().equalsIgnoreCase(brand) && p.getModel().equalsIgnoreCase(model));
    }

    public void printVehicles() {
        vehicles.forEach(System.out::println);
    }


}
