package Generics.WildCard;

public class Main {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Test<?> test = demo.doTest();
//        test.setData(1000);
//        Object data = test.getData();
//        System.out.println(data);


//        test.setData(null);
//        Object data = test.getData();
    }
}
