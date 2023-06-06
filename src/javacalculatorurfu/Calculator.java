package javacalculatorurfu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Double a = 0.0;
        Double b = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello calculator");
        System.out.println("Enter the numbers:");

        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("a = " + a + " b = " + b);

        System.out.println("Enter the operator (+,-,*,/):");

        Character operator = sc.next().charAt(0);
        Double result = null;

        switch (operator) {
            case '*':
                System.out.println(a * b);
            case '/':
                try {
                    System.out.println(a / b);
                } catch (ArithmeticException e) {
                    System.out.println("division by zero");
                }

            default:
                System.out.println("error operator");
        }
    }
}