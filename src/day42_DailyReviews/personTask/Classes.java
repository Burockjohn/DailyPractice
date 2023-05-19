package day42_DailyReviews.personTask;

import java.util.ArrayList;

public class Classes {

    private String className;

    private Teacher teacher;
    private ArrayList<Student> students;

    //-----------------------------------------//

    public Classes(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getClassName() {

        for (char ch : className.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                System.err.println("Invalid name");
                System.exit(1);
            }
        }
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public void removeStudent(Student student) {
        students.remove(student);

    }

    //---------------------------------------------------------//


    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", teacher=" + teacher +
                ", number of students= " + students.size() +
                '}';
    }
}

/*

Create a class named Classes
private instance variables:className,teacher(Teacher Object), students arrayList of Student
Constructor : sets all fields
Actions getters and setters(check is className is alphabetic),addStudent,removeStudent

 */