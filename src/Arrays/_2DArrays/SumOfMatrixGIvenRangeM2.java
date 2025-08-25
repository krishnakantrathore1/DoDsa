package Arrays._2DArrays;

import java.util.Scanner;

// in this method we use only one loop that reduce the time complexity. we create a prefix sum row wise and column wise both
public class SumOfMatrixGIvenRangeM2 {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] prefSum(int[][]arr){
        int r = arr.length;
        int c = arr[0].length;
        // pref sum row wise
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j]+=arr[i][j-1];
            }
        }
        // pref sum column wise
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j]+=arr[i-1][j];
            }
        }
        return arr;
    }
    public static int matrixSum(int[][] arr ,int r1,int c1,int r2,int c2){
        prefSum(arr);
        int ans=0, total=0, left=0, up=0, leftUp=0;
        total = arr[r2][c2];
        if (c1>=1) {
            left = arr[r2][c1 - 1];
        }
        if (r1>=1) {
            up = arr[r1 - 1][c2];
        }
        if (c1>=1&&r1>=1) {
            leftUp = arr[r1 - 1][c1 - 1];
        }
        ans = total-left-up+leftUp;
        return ans;
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
