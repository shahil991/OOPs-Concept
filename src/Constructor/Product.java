package Constructor;

public class Product {

    private int id;
    private int ratings;

    public Product(int id, int ratings) {
        this.id = id;
        this.ratings = ratings;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public int getRatings() {
        return ratings;
    }



//    public  Product() {
//        System.out.println("C1");
//    }
//    public Product(int x){
//        System.out.println("C2");
//    }
//
//    public Product(boolean x){
//        System.out.println("C3");
//    }
//
//    public Product(String x){
//        System.out.println("C4");
//    }
}
