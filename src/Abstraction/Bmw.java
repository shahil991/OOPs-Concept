package Abstraction;

public class Bmw implements Car{

    @Override
    public String drive() {
        return "Bmw Drive";
    }

    @Override
    public String color() {
        return "Bmw Color";
    }

    @Override
    public String engine() {
        return "Bmw Engine";
    }
}
