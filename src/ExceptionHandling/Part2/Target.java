package ExceptionHandling.Part2;

import java.util.Scanner;

public class Target {
    public int test() {

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
            return 0;
        }
        finally {
            System.out.println("Exit");
            sc.close();
        }
        return 0;
    }
}
