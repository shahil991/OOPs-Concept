package Abstraction;

public class Main {
    /*public static void main(String[] args) {

        Car car=new getMeObject(1111);
        if(car!=null) {
            String drive = car.drive();
            System.out.println(drive);
        }
    }

    private static Car getMeObject(int code){
        if(code==1111) {
            return new Bmw();
        }
        return null;
    }*/

    public static void main(String[] args) {
        Test t = new Demo(10);
        t.use();
        t.t1();
        t.t2();
    }
}
