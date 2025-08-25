package Arrays._2DArrays;

import java.util.Scanner;

public class PascleTriangle {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascle(int n){
        int[][] ans= new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];   // variable size column
            ans[i][0]=ans[i][i]=1;  // make boundary element 1
            for (int j = 1; j < i ; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");   // sqaure array
        int n= in.nextInt();   // rows are fix in pascle but col are not
        int[][] ans = pascle(n);
        print(ans);
    }
}
