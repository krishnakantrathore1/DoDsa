package Arrays;

import java.util.Scanner;

public class CheckMoreNumPresentInArray {
    static int[] makeFreqArr(int[] arr){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8};
        int[] freq = makeFreqArr(arr);
        System.out.print("Enter the number of querry: ");
        int q = in.nextInt();
        while(q>0){
            System.out.print("Enter the number to be searched: ");
            int x = in.nextInt();
            if(freq[x]>0){
                System.out.println("Available");
            }else System.out.println("Not Available");
            q--;
        }


    }
}
