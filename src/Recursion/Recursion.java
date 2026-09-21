package Recursion;

public class Recursion {

    public int find(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        return n*find(n-1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int result = recursion.find(5);
        System.out.println(result);
    }
}
