package Abstraction;

import org.w3c.dom.ls.LSOutput;

public abstract class Test {

    private int x;
    private static int y;

    static {
        y=10;
    }
    {
        System.out.println("Welcome");
    }
    public Test(int x) {
        this.x = x;
    }

    private String logic() {
        return "logic";
    }


    // Non-Static-Method
    public void use(){
        System.out.println(logic());
        System.out.println("My Values: "+x);
    }

    // Static Method
    public static int getCommonValue(){
        return y;
    }

    public abstract void t1();
    public abstract void t2();

    // except private all are allowed
}
