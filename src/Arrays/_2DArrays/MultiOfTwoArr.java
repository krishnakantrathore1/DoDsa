package Arrays._2DArrays;

import java.util.Scanner;

public class MultiOfTwoArr {
    public static void print(int[][] arr,int r1,int c2) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] mul(int [][] arr1, int r1 , int c1, int[][] arr2 , int r2, int c2){
        int[][] mul= new int[r1][c2];
        for (int i = 0; i < r1; i++) {               // traverse the row
            for (int j = 0; j < c2; j++) {           // traverse the col
                for (int k = 0; k < c1; k++) {       // multiply every row and every col and add in every iteration
                    mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of row and col for Matrix 1: ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.println("Enter the number of row and col for Matrix 2: ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        System.out.println("Eter the elements of the matrix 1: ");
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]= in.nextInt();
            }
        }
        System.out.println("Eter the elements of the matrix 2: ");
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j]= in.nextInt();
            }
        }
        int[][] mul= mul(arr1,r1,c1,arr2,r2,c2);
        print(mul,r1,c2);
    }
}
