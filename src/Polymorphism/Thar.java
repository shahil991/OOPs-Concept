package Polymorphism;

public class Thar extends Car{

    @Override
    public void drive(){
        System.out.println("thar-drive");
    }
    @Override
    public void color(){
        System.out.println("thar-color");
    }
    @Override
    public void speed(){
        System.out.println("thar-speed");
    }
    @Override
    public void mileage(){
        System.out.println("thar-mileage");
    }
}
