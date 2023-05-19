package day46_DailyReviews;

public class Test {

    public static void main(String[] args) {

        Dealership bayi1 = new Dealership();

        Car car1 = new Car("Toyota", "Corolla", 2022, 750_000, 4);
        Car car2 = new Car("Fiat", "Şahin", 1998, 150_000, 4);
        Motorcycle motorcycle1 = new Motorcycle("Honda", "R250", 2022, 280_000, 250);
        Motorcycle motorcycle2 = new Motorcycle("Kawasaki", "Zx", 2016, 444_000, 900);

        bayi1.addVehicle(car1);
        bayi1.addVehicle(car2);
        bayi1.addVehicle(motorcycle1);
        bayi1.addVehicle(motorcycle2);

        System.out.println(bayi1.getVehicles());

        System.out.println("-------------------------------------------------");

        bayi1.getVehicles().forEach(p -> p.setPrice(p.getPrice() * 1.1));
        bayi1.getVehicles().forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        bayi1.getVehicles().stream().filter(p -> p.getYear() == 2022).forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        for (Vehicle vehicle : bayi1.getVehicles()) {
            if (vehicle instanceof Car) {
                ((Car) vehicle).drive();
            }
            if (vehicle instanceof Motorcycle) {
                ((Motorcycle) vehicle).wheelie();
            }
        }

    }
}
