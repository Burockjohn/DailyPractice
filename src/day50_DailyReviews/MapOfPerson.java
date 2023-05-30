package day50_DailyReviews;

import java.util.*;

public class MapOfPerson {

    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();

        Person person1 = new Person(1, "Burak", "Can");
        Person person2 = new Person(2, "Yunus", "Kulcu");
        Person person3 = new Person(3, "Burak", "Yılmaz");
        Person person4 = new Person(4, "Çağlar", "Engin");
        Person person5 = new Person(5, "Ayşe", "Pek");
        Person person6 = new Person(6, "Tuğba", "Bayar");
        Person person7 = new Person(7, "Nesrin", "Hançer");

        List<Person> listOfPeople = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));

        for (Person person : listOfPeople) {
            people.put(person.getId(), (person.getFirstName() + " " + person.getLastName()));
        }

        System.out.println(people);


    }
}
