package Arrays._2DArrays;

import java.util.Scanner;

public class Rotate90ClockWise {
    public static void print(int[][] arr,int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return arr;
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
    }
    public static void rotateMatrix(int[][] arr, int r, int c){
        // first we rotate the matrix
        transposeInPlace(arr,r,c);
        // reverse the every array
        for (int i = 0; i < r; i++) {
            reverse(arr[i]);
        }
        print(arr, r, c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and col (row=col):");   // sqaure array
        int r= in.nextInt();
        int c= in.nextInt();
        System.out.println("Enter the Array Elements:");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        rotateMatrix(arr,r,c);
    }

}
