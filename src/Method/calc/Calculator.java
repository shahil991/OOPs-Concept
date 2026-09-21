package Method.calc;

public class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum = " + (a+b));
    }

    public  void sub(int a, int b) {
        System.out.println("Sub = " + (a-b));
    }

    // method without parameter with return value

    public int add() {
        int x = 10;
        int y = 20;
        return x+y;
    }

    // method with parameter with return value

    public int add1(int x, int y) {
        return x+y;
    }

}
