package Polymorphism;

public class Bmw extends Car{

    @Override
    public void drive(){
        System.out.println("bmw-drive");
    }
    @Override
    public void color(){
        System.out.println("bmw-color");
    }
    @Override
    public void speed(){
        System.out.println("bmw-speed");
    }
    @Override
    public void mileage(){
        System.out.println("bmw-mileage");
    }
}
