package Inheritance;

public class Car1 {

    private int cno;
    private String mileage;

    public Car1(int cno, String mileage) {
        System.out.println("PCC");
        this.cno = cno;
        this.mileage = mileage;
    }

    public void printAllCar(){
        System.out.println("Car No: "+cno);
        System.out.println("Car Mileage: "+mileage);
    }
}
