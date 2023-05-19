package day45_DailyReviews;

public class Tester extends Employee{

    private String testingTool;

    public Tester(String firstName, String lastName, int age, double salary, String testingTool) {
        super(firstName, lastName, age, salary);
        setTestingTool(testingTool);
    }

    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }

    public void test() {
        System.out.println(getFirstName() + " " + getLastName() + " is testing");
    }

    public String toString() {
        return "Tester{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                " testingTool='" + testingTool + '\'' +
                '}';
    }
}
