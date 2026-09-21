package StaticKeyword;

public class Car {
    public static int countryCode;

    static {
        System.out.println("Static");
    }

    private int carNo;
    private String ownerName;

    public Car(int carNo, String ownerName) {
        System.out.println("Constructor");
        this.carNo = carNo;
        this.ownerName = ownerName;
        countryCode=1010;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getCarNo() {
        return carNo;
    }

    public static int getCountryCode() {
        return countryCode;
    }
}
