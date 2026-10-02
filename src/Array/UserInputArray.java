package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size");
        int size = scanner.nextInt();

        int arr[]=new int[size];

        //Insert Element
        for(int i=0; i< arr.length; i++) {
            System.out.print("Enter element-"+ i+" ");
            arr[i]= scanner.nextInt();
        }

        for(int k : arr) {
            System.out.println(k);
        }
        scanner.close();
    }
}
