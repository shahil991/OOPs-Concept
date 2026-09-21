package Encapsulation;

public class Repository {
    public void save(Product product){

        System.out.println(product.getpId());
        System.out.println(product.getpName());
        System.out.println(product.getpRatings());
    }
}
