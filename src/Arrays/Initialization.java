package Arrays;

import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
//        arr[0] = 8;
//        arr[1] = 8;
//        arr[2] = 8;
//        arr[3] = 8;
//        arr[4] = 8;
//        input
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
//       output
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//    }

//        for sum of the elements of the array
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);



        }
    }

