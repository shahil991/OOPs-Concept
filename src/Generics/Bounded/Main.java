package Generics.Bounded;

public class Main {
    public static void main(String[] args) {
        Test<bmw> bmwTest = new Test<>();
        bmwTest.setData(new bmw());
        System.out.println("BMW Test Data: " + bmwTest.getData());

        Test<Thar> tharTest = new Test<>();
        tharTest.setData(new Thar());
        System.out.println("Thar Test Data: " + tharTest.getData());
    }
}
