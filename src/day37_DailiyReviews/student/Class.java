package day37_DailiyReviews.student;

import java.util.ArrayList;

public class Class {

    public ArrayList<Student> students = new ArrayList<>();
    public String className, teacherName;

    public Class(String className, String teacherName) {
        this.className = className;
        this.teacherName = teacherName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String toString() {
        return "Class{" +
                "students=" + students +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}

/*

Create a class named Classes
instances:students(arraylist of Students),className,teacherName
actions: toString, addStudent,removeStudent

 */