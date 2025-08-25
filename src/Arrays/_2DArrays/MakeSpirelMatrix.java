package Arrays._2DArrays;

import java.util.Scanner;

public class MakeSpirelMatrix {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void makeSpiral(int n) {
        int[][] arr = new int[n][n];
        int num=1;
        int toprow = 0, bottrow = n - 1;
        int leftcol = 0, rightcol = n - 1;

        while (toprow <= bottrow && leftcol <= rightcol) {
            // Top row: left → right
            for (int i = leftcol; i <= rightcol; i++) {
                arr[toprow][i]=num;
                num++;
            }
            toprow++;

            // Right column: top → bottom
            for (int i = toprow; i <= bottrow; i++) {
                arr[i][rightcol]=num;
                num++;
            }
            rightcol--;

            // Bottom row: right → left
            if (toprow <= bottrow) {
                for (int i = rightcol; i >= leftcol; i--) {
                    arr[bottrow][i]=num;
                    num++;
                }
                bottrow--;
            }

            // Left column: bottom → top
            if (leftcol <= rightcol) {
                for (int i = bottrow; i >= toprow; i--) {
                    arr[i][leftcol]=num;
                    num++;
                }
                leftcol++;
            }
        }
        print(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        makeSpiral(n);
    }
}
