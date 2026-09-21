package Abstraction;

public class Demo extends Test{

    public Demo(int x) {
        super(x);
    }

    @Override
    public void t1() {
        System.out.println("t1");
    }

    @Override
    public void t2() {
        System.out.println("t2");
    }
}