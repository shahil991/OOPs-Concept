package Constructor;

public class Main1 {
    public static void main(String[] args){

        Product product = new Product(10,5);
        System.out.println(product.getId());
        System.out.println(product.getRatings());

        product.setId(1000);
        product.setRatings(4);

        System.out.println(product.getId());
        System.out.println(product.getRatings());

//        new Product();
//        new Product(10);
//        new Product(false);
//        new Product("xyz");
    }
}
