package day40_DailyReviews.name;

import java.util.ArrayList;
import java.util.Arrays;

public class TestName {

    public static void main(String[] args) {

        Name name1 = new Name("Erdal", "Gökten düşen ilk bakkal tanesi", 'M');
        Name name6 = new Name("Buşra", "Can ailesi", 'F');
        Name name2 = new Name("Burak", "Can ailesi", 'M');
        Name name3 = new Name("Berra", "Can ailesi", 'F');
        Name name4 = new Name("Beren", "Can ailesi", 'F');
        Name name5 = new Name("Işık", "Ilık süt iç", 'F');
        Name name7 = new Name("Cydeo", "Wooden Spoon", 'M');

        ArrayList<Name> list = new ArrayList<>(Arrays.asList(name1, name2, name3, name4, name5, name6, name7));

        list.stream().filter(p -> p.gender == 'M').forEach(p -> System.out.println(p.name));
        for (Name person : list) {
            if (person.gender == 'F') System.out.println(person.name + " means " + person.meaning);
        }

         /*
        //Second solution
        names.stream()
                .filter(i->i.gender=='M')
                .map(i->i.name)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        names.stream()
                .filter(i->i.gender=='F')
                .map(i->i.name + "  "+i.meaning)
                .forEach(System.out::println);
*/


    }
}

/*

Create a class named TestName with a main method
Create 7 Name objects and add them into an arraylist
Print male names (only names, not meanings and genders) from Arraylist
Then print all female names and their meanings.

 */
