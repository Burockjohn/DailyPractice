package day37_DailiyReviews.student;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student("Burak", "Can", 'M', 36);
        Student student2 = new Student("Tuğba", "Bayar", 'F', 24);
        Student student3 = new Student("Yunus", "Kulcu", 'M', 37);
        Student student4 = new Student("Çağlar", "Engin", 'M', 16);
        Student student5 = new Student("Recep", "Çavuşoğlu", 'M', 32);

        Class class1 = new Class("Cydeo", "Adam");
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);

        class1.removeStudent(student1);

        System.out.println(class1.students);

        System.out.println("-----------------------------------------------------------------");

        System.out.println(class1);


    }
}
/*

Create a class named Test
Create a Classes object and add five students to the class object
Print the class object

 */
