package day42_DailyReviews.personTask;

public class Test {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Duriye", "Tetik", 52, 'F', "NamıkKemalİlkokulu", 13_500);
        Student student1 = new Student("Burak", "Can", 52, 'M', "NamıkKemalİlkokulu", 'A');
        Student student2 = new Student("Berra", "Can", 52, 'F', "NamıkKemalİlkokulu", 'B');
        Student student3 = new Student("Mustafa", "Can", 52, 'M', "NamıkKemalİlkokulu", 'C');
        Student student4 = new Student("Beren", "Can", 52, 'F', "NamıkKemalİlkokulu", 'D');
        Student student5 = new Student("Zeki", "Turan", 52, 'M', "NamıkKemalİlkokulu", 'E');
        Student student6 = new Student("Buşra", "Can", 52, 'F', "NamıkKemalİlkokulu", 'F');

        Classes class1 = new Classes("5-A", teacher);
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);
        class1.addStudent(student6);

        for (Student student : class1.getStudents()) {
            if (student.getGender() == 'M') {
                student.study();
            } else if (student.getGender() == 'F') {
                student.speak();
            }
            System.out.println("----------------------------------");
        }

        class1.getStudents().stream().filter(p -> p.getGrade() == 'A').forEach(Person::sleep);

        System.out.println("--------------------------------------");

        if (teacher.getGender() == 'F') {
            for (Student student : class1.getStudents()) {
                student.eat();
            }
        } else {
            teacher.eat();
        }

    }
}

/*

Create a class named Test with a main method
Create a classes object and add 6 student in it.
Call Male students' study methods
Call Female students' speak methods
Call sleep methods for students whose grade is A
If teacher is female call eat methods for all students otherwise call eat method for only teacher

 */