package Arrays._2DArrays;

import java.util.Scanner;

public class _2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr= {{23,45,61},{57,53,54},{32,56,32}};

        for(int[] row: arr) {
            for (int age: row){
                System.out.print(age+" ");
            }
            System.out.println();
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // take input from the user

//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int [][] arr = new int[n][m];  // 2d array declaration
//        // taking input
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j]=in.nextInt();
//            }
//        }
//        // traversing in 2d array
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}
