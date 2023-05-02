package day37_DailiyReviews.ex3_Cat;

public class Cat {

    public String name;
    public char gender;
    public int age;

    public Cat(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

/*

Create a class named Cat
instances:name,age,gender
a constructor:sets all fields
actions:eat,sleep,play,toString
Create a TestCat class
Create 6 cat objects and add them into an arraylist

print the cats which are younger than 5 and male

 */