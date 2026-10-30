package ExceptionHandling.Part3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Target implements AutoCloseable {

    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age<15){
            throw new InputMismatchException("Age should be less than 15");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Close...");
    }
}
