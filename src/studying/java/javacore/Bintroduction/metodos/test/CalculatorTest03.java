package studying.java.javacore.Bintroduction.classes.test;

import studying.java.javacore.Bintroduction.classes.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divisionTwoNumbers(20, 0);
        System.out.println(result);
    }
}
