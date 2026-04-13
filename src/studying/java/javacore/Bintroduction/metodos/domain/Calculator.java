package studying.java.javacore.Bintroduction.metodos.dominio;

public class Calculator {

    public void sumTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void subtractTwoNumber(){
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, float num2){
        System.out.println(num1 * num2);

    }

    public double divisionTwoNumbers(double num1, double num2){
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public void alterTwoNumbers (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Within of alterTwoNumbers");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }
}
