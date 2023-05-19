package day38_DailiyReviews.dog;

public class Dog {

    public String name;
    public char gender;
    public int age;

    public Dog(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

/*

Create a class named Dog
instances: name,age,gender
a constructor: sets all fields
actions:bark,eat,toString

 */