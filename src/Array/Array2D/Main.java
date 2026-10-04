package Array.Array2D;

public class Main {
    public static void main(String[] args) {

        // 3 Dept => 3 Student => 9 Std
        int arr[][]={
                {11,22,33,88,100},
                {22,33,44,87},
                {33,44,55}
        };

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
