package Excepciones;

import java.util.*;

public class DivisionSegura {

    public static void main(String[] args) {
        try {
            int num1, num2;

            System.out.print("Enter Number 1: ");
            num1 = new Scanner(System.in).nextInt();

            System.out.println("");

            System.out.print("Enter Number 2: ");
            num2 = new Scanner(System.in).nextInt();

            int div = num1 / num2;
            System.out.println("The division is: " + div);

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
            System.out.println(e.getMessage());

        }
    }

}
