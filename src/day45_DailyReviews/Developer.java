package day45_DailyReviews;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String firstName, String lastName, int age, double salary, String programmingLanguage) {
        super(firstName, lastName, age, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(getFirstName() + " " + getLastName() + " is writing codes");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                " programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
