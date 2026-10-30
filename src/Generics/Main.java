package Generics;

public class Main {
    public static void main() {

//        Test<Integer> test = new Test<Integer>();
//        test.setData(133);    // type safe
//        Integer data = test.getData();
//        System.out.println(data);

        Test<Integer, String> test = new Test<Integer, String>(100,"Raju");

        System.out.println("Key = " + test.getKey());
        System.out.println("Value = " + test.getValue());
    }
}
