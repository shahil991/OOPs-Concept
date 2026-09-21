package Encapsulation;

public class Main {
    public static void main(String[] args) {
        int pId=11;
        String pName="mouse";
        String pRating="*****";

        Product product = new Product();   // Bag
        product.setpId(pId);               // things
        product.setpName(pName);
        product.setpRatings(pRating);

        Repository repo = new Repository();
        repo.save(product);    // travel
    }
}
