package ExceptionHandling.Part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException exception) {
            System.out.println("do not divide by zero");
        }
        catch (InputMismatchException exception) {
            System.out.println("Take int value only");
        }
        catch (Exception exception) {
            System.out.println("Something went wrong");
        }
        System.out.println("Exit");
    }
}
