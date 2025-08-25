package Arrays;
// use array from 1 index(1 indexing array)

import java.util.Scanner;

public class PrefixSumGivenRange {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n+1]; // we give a extra space for the array and take the input from the index 1. it also have index 0 with the value of 0
        System.out.print("Enter the elements: ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] pref = prefixSum(arr);
//        print(pref);
        System.out.print("Enter the number of queries: ");
        int q = in.nextInt();
        while(q>0){
            System.out.print("Enter the start range: ");
            int l = in.nextInt();
            System.out.print("Enter the end range: ");
            int r = in.nextInt();
            int sum = pref[r]-pref[l-1];
            System.out.println(sum);
            q--;
        }
    }
}
