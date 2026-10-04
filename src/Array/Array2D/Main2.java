package Array.Array2D;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 3 dept => 4 std
        System.out.println("Enter No of Dept");
        int dept=sc.nextInt();
        System.out.println("Enter No of Std in Each Dept");
        int std=sc.nextInt();
        int arr[][] = new int[dept][std]; // [No of 1D array] [Size of Each 1D Array]

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
