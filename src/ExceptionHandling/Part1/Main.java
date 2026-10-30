package ExceptionHandling.Part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
            System.out.println("******");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Do Not Divide By Zero");
        }

        System.out.println("Exit");
    }
}
