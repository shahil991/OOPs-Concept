package Method;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        System.out.println("Enter a char");
        char c = sc.next().charAt(0);

        CheckVal(num, c);

    }

    public static void CheckVal(int num, char c) {
        if(num>c) {
            System.out.println("num is greater than char ");
        } else if (c>num) {
            System.out.println("char is greater than num ");
        } else {
            System.out.println("both are equal");
        }
    }
}
