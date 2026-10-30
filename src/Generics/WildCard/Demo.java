package Generics.WildCard;

import java.util.Scanner;

public class Demo {

    // Wild Card Generics
    public Test<?> doTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int intValue = sc.nextInt();
        if(intValue>100) {
            Test<Integer> test1 = new Test<Integer>();
            test1.setData(200);
            return test1;
        } else {
            Test<String> test2 = new Test<String>();
            test2.setData("raju");
            return test2;
        }
    }
}
