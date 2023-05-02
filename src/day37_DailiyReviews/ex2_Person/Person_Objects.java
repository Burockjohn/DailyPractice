package day37_DailiyReviews.ex2_Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Person_Objects {

    public static void main(String[] args) {

        Person person1 = new Person("Burak", "Can", 36);
        Person person2 = new Person("Yunus", "Kulcu", 37);
        Person person3 = new Person("Çağlar", "Güler", 17);
        Person person4 = new Person("Recep", "Çavuşoğlu", 24);
        Person person5 = new Person("Burak", "Yılmaz", 36);

        ArrayList<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        for (Person person : list) {
            if (person.age > 25) System.out.println(person);
        }

        System.out.println("---------------------------------------------------------------");

        list.removeIf(each -> each.age < 25);

        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        ArrayList<Person> list1 = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));
        System.out.println(list1.stream().filter(each -> each.age > 25).collect(Collectors.toList()));

    }
}
