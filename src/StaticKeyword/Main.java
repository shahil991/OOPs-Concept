package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1212,"Sahil");
        System.out.println(car.getCarNo());
        System.out.println(car.getOwnerName());
        System.out.println(Car.getCountryCode());

        Car car1 = new Car(1213,"Raju");
        System.out.println(car1.getCarNo());
        System.out.println(car1.getOwnerName());
        System.out.println(Car.getCountryCode());
    }
}
