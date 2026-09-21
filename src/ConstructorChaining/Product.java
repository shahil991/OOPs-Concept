package ConstructorChaining;

public class Product {

    public Product(){
        this(10);
        System.out.println("C1");
    }

    public Product(int x){
        this(true);
        System.out.println("C2");
    }
    public Product(boolean x){
        System.out.println("C3");
    }
}
