package Arrays._2DArrays;

import java.util.Scanner;

public class SumOfMatrixGivenRange {
    public static int matrixSum(int[][] arr ,int r1,int c1,int r2,int c2){
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1,1,1,1,1},
                       {1,1,1,1,1},
                       {1,1,1,1,1},
                       {1,1,1,1,1},
                       {1,1,1,1,1},};
        System.out.println("Enter the start range r1, c1");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.println("Enter the end range r2, c2");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        System.out.println("The sum the matrix in given range: ");
        System.out.println(matrixSum(arr,r1,c1,r2,c2));
    }
}
