package Arrays;

import java.util.Scanner;

// java ke ander array ki kabhi copy nhi bnati he. agar ek array ko dusre arrey me bhi copy krle uske baad usme koi change kre
// to bhi jo orgginal array hoga usme bhi change aa jayega.
public class ArraysBasic {
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr = {3,4,62,3,5};
        System.out.println("orginal array");
        print(arr);
        int [] arr2 = arr;
        arr2[0]=8;
        System.out.println("orginal array after the change");
        print(arr);
        System.out.println("arr2 after the change array");
        print(arr2);
    }
}
