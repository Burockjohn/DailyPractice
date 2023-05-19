package day38_DailiyReviews.bird;

public class Bird {

    public String name;
    public int age;
    public boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        this.name = name;
        this.age = age;
        this.canFly = canFly;
    }

    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", canFly=" + canFly +
                '}';
    }
}

/*

Create a class named Bird
Instance variables: name,isFly,age
A constructor :sets all fields
Actions:toString

 */
