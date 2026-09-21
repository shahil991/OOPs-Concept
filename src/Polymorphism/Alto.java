package Polymorphism;

public class Alto extends Car{

    @Override
    public void drive(){
        System.out.println("alto-drive");
    }
    @Override
    public void color(){
        System.out.println("alto-color");
    }
    @Override
    public void speed(){
        System.out.println("alto-speed");
    }
    @Override
    public void mileage(){
        System.out.println("alto-mileage");
    }
}
