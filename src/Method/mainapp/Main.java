package Method.mainapp;

import Method.calc.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Calculator cal = new Calculator();
//        cal.add(2,4);
//        cal.sub(4,6);
//        int res = cal.add();
//        System.out.println("Result = "+res);

        int result = cal.add1(3,5);
        System.out.println(result);

        System.out.println("Exit");

    }
}
