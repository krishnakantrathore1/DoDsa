package Arrays._2DArrays;

import java.util.Scanner;

public class TransposeArray {
    public static void print(int[][] arr,int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // by using extra array

    public static int[][] transpose(int [][] arr, int r , int c){
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {               // traverse the row
            for (int j = 0; j < c; j++) {           // traverse the col
                ans[j][i]=arr[i][j];
            }
        }
        return ans;
    }

   //without using extra array

    public static void transposeInPlace(int [][] arr, int r , int c){
        for (int i = 0; i < r; i++) {               // traverse the row
            for (int j = i; j < c; j++) {           // traverse the col
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr,r,c);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and col:");
        int r= in.nextInt();
        int c= in.nextInt();
        System.out.println("Enter the Array Elements:");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= in.nextInt();
            }
        }
//        transposeInPlace(arr,r,c);    // condition should be satisfied r=c

        int[][] ans = transpose(arr,r,c);   //these two lines for method 1
        print(ans,c,r);
    }
}
