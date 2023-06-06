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

        System.out.println("a = " +a+ " b = " +b);

        System.out.println("Enter the operator (+,-,*,/):");

        Character operator = sc.next().charAt(0);
        Double result = null;

        switch (operator) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == null && b != 0.0) {
                    result = a / b;
                } else {
                    System.out.println("Divide to zero! Change b number!");
                }
                break;

            default:
                System.out.println("Wrong input");
        }

        if(result == null){
            System.out.println("Something went wrong");
        } else {
            System.out.println("The final result:");
            System.out.println(a + " " + operator + " " + b + " = " + result);
        }
    }
}