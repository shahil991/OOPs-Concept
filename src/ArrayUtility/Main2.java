package ArrayUtility;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {11,65,45,2,76},
//                {11,65,45,2,76},
//                {11,65,45,2,76}
//        };


// sort method
//        Arrays.sort(arr);

//        for(int elm: arr) {
//            System.out.print(elm+" ");
//        }

        // binarysearch method
//        int i = Arrays.binarySearch(arr,45);
//        System.out.println(i);

        // toString method
//        String res = Arrays.toString(arr);
//        System.out.println(res);


        // toString for multi array
//        String res = Arrays.deepToString(arr);
//        System.out.println(res);

//  equals method
//        int[] arr1={1,2,4};
//        int[] arr2={1,2,3};
//
//        boolean equals = Arrays.equals(arr1, arr2);
//        System.out.println(equals);


        //fill method
//        int [] arr = new int[10];
//        Arrays.fill(arr,99);
//
//        for (int elm : arr) {
//            System.out.print(elm+" ");
//        }



        // copyof method
//        int[] arr={11,22,33,44,55};
//        int[] newArr = Arrays.copyOf(arr, arr.length+5);
//        for(int elm: newArr) {
//            System.out.print(elm+" ");
//        }


        // mismatch method
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,2,4,5};

        int mismatch = Arrays.mismatch(arr1,arr2);
        System.out.println(mismatch);
    }
}
