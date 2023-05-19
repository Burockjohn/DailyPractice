package day41_DailyReviews.teacherTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Burak");
        teacher1.setLastName("Can");
        teacher1.setGender('M');
        teacher1.setDateOfBirth(LocalDate.of(1987, 2, 15));
        teacher1.setAge();
        teacher1.setId(8);

        Teacher teacher2 = new Teacher();
        teacher2.setFirstName("Sacide");
        teacher2.setLastName("Maran");
        teacher2.setGender('F');
        teacher2.setDateOfBirth(LocalDate.of(1967, 3, 8));
        teacher2.setAge();
        teacher2.setId(4);

        Teacher teacher3 = new Teacher();
        teacher3.setFirstName("Buşra");
        teacher3.setLastName("Turan");
        teacher3.setGender('F');
        teacher3.setDateOfBirth(LocalDate.of(1993, 4, 12));
        teacher3.setAge();
        teacher3.setId(16);

        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3));

    }

    public static ArrayList<Teacher> getLastNameStartsWithM() {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getLastName().startsWith("M")) {
                result.add(teacher);
            }
        }

        return result;
    }

    public static ArrayList<Teacher> getFTeachers() {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getGender() == 'F') {
                result.add(teacher);
            }
        }

        return result;

    }

    public static ArrayList<Teacher> getTeachersUnder30() {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getAge() < 30) {
                result.add(teacher);
            }
        }

        return result;

    }

    public static ArrayList<Teacher> getBornIn1967() {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.getDateOfBirth().getYear() == 1967) {
                result.add(teacher);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println("getLastNameStartsWithM() = " + getLastNameStartsWithM());
        System.out.println("getFTeachers() = " + getFTeachers());
        System.out.println("getTeachersUnder30() = " + getTeachersUnder30());
        System.out.println("getBornIn1967() = " + getBornIn1967());

    }

}

/*

    2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a method in School class then find the teachers born in 1967 year

 */