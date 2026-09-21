package MethodOverloading;

public class MethodOver {

    public void add(int x) {
        System.out.println(x);
    }

    public void add(int x, int y) {
        System.out.println(x+y);
    }

    public void add(int x, int y,int z) {
        System.out.println(x+y+z);
    }

    public void add(int x, double y) {
        System.out.println(x+y);
    }


}
