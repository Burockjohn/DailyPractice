package day40_DailyReviews.name;

public class Name {

    public String name, meaning;
    public char gender;

    public Name(String name, String meaning, char gender) {
        this.name = name;
        this.meaning = meaning;
        this.gender = gender;
    }

    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", meaning='" + meaning + '\'' +
                ", gender=" + gender +
                '}';
    }
}

/*

Create a class named Name
Instance variables: name,meaning,gender
A constructor :sets all fields
Actions:toString

 */