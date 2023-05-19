package day38_DailiyReviews.car;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 1998, 240000, false);
        Car car2 = new Car("Honda", 2012, 350000, false);
        Car car3 = new Car("Şahin", 1992, 100000, false);
        Car car4 = new Car("Mercedes", 2016, 740000, false);
        Car car5 = new Car("Volkswagen", 2019, 1240000, false);
        Car car6 = new Car("BMW", 2004, 480000, false);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5, car6));

        for (Car car : cars) {
            if ((2023 - car.year) < 10) {
                car.isStarted = true;
                car.start();
            }
        }

        for (Car car : cars) {
            if (!car.isStarted) System.out.println(car);
        }

    }
}

/*

Create a TestCar class with a main method.
Create an arraylist of 6 Car objects
Start all cars whose age is less than 10
Print all cars which are not started

 */