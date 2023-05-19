package day38_DailiyReviews.bird;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBird {

    public static void main(String[] args) {

        Bird bird1 = new Bird("devekuşu", 2, false);
        Bird bird2 = new Bird("baykuş", 1, true);
        Bird bird3 = new Bird("tavuk", 1, false);
        Bird bird4 = new Bird("kartal", 2, true);
        Bird bird5 = new Bird("Sabri", 36, false);

        ArrayList<Bird> list = new ArrayList<>(Arrays.asList(bird1, bird2, bird3, bird4, bird5));

        for (Bird bird : list) {
            if (bird.canFly) System.out.println(bird);
        }

        ArrayList<Bird> adultBirds = new ArrayList<>(Arrays.asList(bird1, bird2, bird3, bird4, bird5));
        adultBirds.removeIf(p -> p.age <= 5);

        for (Bird adultBird : adultBirds) {
            adultBird.name = adultBird.name.toUpperCase();
        }

        System.out.println(adultBirds);

    }
}

/*

Create a TestBird class with a main method
Add 5 Bird objects into an arraylist and print birds which can fly with a title "Can Fly"

Make upper case the names of the birds which are older than 5 and print them with a title "Adult Birds"

 */