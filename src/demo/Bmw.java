package demo;

public class Bmw {
    static {
        System.out.println("Static Data Init");
    }

    {
        System.out.println("Welcome");
    }

    public Bmw(){
        System.out.println("Instance Data Init1");
    }
    public Bmw(int carNo){
        System.out.println("Instance Data Init2");
    }
    public Bmw(String name){
        System.out.println("Instance Data Init3");
    }

}
