package javacalculatorurfu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double a = 0.0;
        double b = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello calculator");
        System.out.println("Enter the numbers:");

        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("a = " +a+ " b = " +b);

        System.out.println("Enter the operator (+,-,*,/):");

        char operator = sc.next().charAt(0);
        double result = 0.0;

        switch (operator) {
            case '+':
                result = a + b;
                break;

            default:
                System.out.println("Wrong input");
        }

        System.out.println("The final result:");
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}