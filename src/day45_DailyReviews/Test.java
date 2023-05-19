package day45_DailyReviews;

public class Test {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Burak", "Can", 35, 100_000, "Java");
        Developer developer2 = new Developer("Yunus", "Kulcu", 36, 110_000, "Python");
        Tester tester1 = new Tester("Burak", "Yilmaz", 36, 120_000, "C++");
        Tester tester2 = new Tester("Caglar", "Engin", 36, 130_000, "C#");

        WorkTeam team = new WorkTeam();

        team.addEmployee(developer1);
        team.addEmployee(developer2);
        team.addEmployee(tester1);
        team.addEmployee(tester2);

        team.printEmployees();

        System.out.println("-----------------------------------------------");

        for (Employee employee : team.getEmployees()) {
            employee.setSalary(employee.getSalary() + 15_000);
        }

        team.printEmployees();

        System.out.println("-----------------------------------------------");

        team.getEmployees().stream().filter(p -> p.getSalary() < 120_000).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        team.getEmployees().stream().filter(p -> p instanceof Developer).forEach(System.out::println);
        team.getEmployees().stream().filter(p -> p instanceof Tester).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        for (Employee employee : team.getEmployees()) {
            if (employee.getAge() > 35) {
                System.out.println("The employees whose age is greater than 35 " + employee);
            }

            if (employee instanceof Developer) {
                ((Developer) employee).code();
            }

            if (employee instanceof Tester) {
               ((Tester) employee).test();
            }
        }

        //Employee employee = developer1;

    }
}
