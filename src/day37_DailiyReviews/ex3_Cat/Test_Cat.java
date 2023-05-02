package day37_DailiyReviews.ex3_Cat;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test_Cat {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Duman", 'M', 6);
        Cat cat2 = new Cat("Muslera", 'M', 4);
        Cat cat3 = new Cat("Kömür", 'F', 4);
        Cat cat4 = new Cat("Boncuk", 'F', 5);
        Cat cat5 = new Cat("Çiko", 'F', 8);
        Cat cat6 = new Cat("Murtaza", 'M', 3);

        ArrayList<Cat> list = new ArrayList<>();
        list.addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));

        for (Cat cat : list) {
            if (cat.age < 5 && cat.gender == 'M') System.out.println(cat);
        }

        System.out.println("-----------------------------------------------------");

        //second solution
        ArrayList<Cat> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));

        System.out.println(list1.stream().filter(p -> (p.age < 5 && p.gender == 'M')).collect(Collectors.toList()));

        System.out.println("-----------------------------------------------------");

        //another action
        list.removeIf(p -> !(p.age < 5 && p.gender == 'M'));
        list.get(0).play();


    }
}
