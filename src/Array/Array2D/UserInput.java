package Array.Array2D;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Dept");
        int dept=sc.nextInt();   // 3,4,5,6


        int arr[][] = new int[dept][]; // [No of 1D array] [Unknown]

        // form
        for(int i=0; i<dept; i++) {
            System.out.println("Enter No of Std in Dept"+i+": ");
            int std=sc.nextInt();
            arr[i]=new int[std];
        }

        // insert
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.println("Enter Roll no of std"+j+"of Dept"+i);
                arr[i][j]=sc.nextInt();
            }
        }

        for( int x[] : arr){
            for( int elm : x) {
                System.out.print(elm+" ");
            }
            System.out.println();
        }
    }
}
