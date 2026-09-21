package Polymorphism;

public class Main {
    public static void main(String[] args) {


        Car1 car = new Car1();

        car.test();
        System.out.println(car.getCountryCode());

//        Pizza pizza = new Pizza();
//        pizza.add();
//        pizza.add(10);


        /*Car car;
        car=new Bmw();
        car.drive();
        car.color();
        car.speed();
        car.mileage();

        car=new Thar();
        car.drive();
        car.color();
        car.speed();
        car.mileage();

        car=new Alto();
        car.drive();
        car.color();
        car.speed();
        car.mileage();  */


//        test(new Bmw());
//        test(new Thar());
//        test(new Alto());

        // Note: Upcasting & Downcasting
//
//        Car car=new Thar();  // Upcasting
//        if(car instanceof Bmw) {
//            Bmw bmw = (Bmw) car; // Downcasting
//            bmw.drive();
//        } else {
//            System.out.println("Bmw Object Not Found");
//        }
    }


//        public static void test(Car car){
//             car.drive();
//             car.color();
//             car.speed();
//             car.mileage();
//        }

    }