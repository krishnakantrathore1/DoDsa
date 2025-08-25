package Arrays;

import java.util.Scanner;

// can we devide the array in equal parts (dono parts ka sum equal hona chahiye)
// iss question ko ham bina prefix array ke bhi karr skte hian. phle array ka total sum nikalo or sath me ek prefix nikalte jao or sufix(total-prefix) == prefix ho jaye to eqaul sub partition possible he
public class EqualPartOfSubArray {
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
        int[] arr = {1,2,3,6,7};
        int[] pref = prefixSum(arr);
        boolean flag = false;
//        print(pref);
        int n = arr.length;
        int i =0,j=n-1;
        while (i<j){
            if (pref[i]==pref[j]-pref[i]){
                flag = true;
            }
            i++;j--;
        }
        System.out.println(flag);
    }
}
