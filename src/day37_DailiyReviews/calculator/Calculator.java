package day37_DailiyReviews.calculator;

public class Calculator {

    double number1, number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    double addition() {
        return number1 + number2;
    }

    double subtraction() {
        return Math.abs(number1 - number2);
    }

    double multiplication() {
        return number1 * number2;
    }

    double division() {
        return number1 / number2;
    }

    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", addition of the numbers = " + addition() +
                ", subtraction of the numbers = " + subtraction() +
                ", multiplication of the numbers = " + multiplication() +
                ", division " + number1 + " by " + number2 + "is = " + division() +
                '}';
    }
}

/*

Create a class named Calculator
Attributes:
               instance : number1, number2
Add a constructor that can set the two instances
Actions:
              methods:addition,subtraction,multiplication,division,toString (shows numbers and the results of other methods)
Create TestCalculator class with a main method and Create an object of Calculator and print object

 */