package Inheritance;

public class Bmw1 extends Car1 {

    private String ai;
    private String policy;

    public Bmw1(int cno, String mileage, String ai, String policy) {
        super(cno, mileage);
        System.out.println("CCC");
        this.policy = policy;
        this.ai = ai;
    }

    public void printAllBmw(){
        super.printAllCar();
        System.out.println("Car No: "+ai);
        System.out.println("Car Mileage: "+ policy);
    }
}
