package Sorting;

public class QSwapUnsortedNumsInSortedArr {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[j]<arr[j-1]){
                j--;
            } else if (arr[i]<arr[i+1]) {
                i++;
            } else if(arr[i]>arr[i+1] && arr[j]>arr[j-1]){
                int temp = arr[i];
                arr[i] = arr[j-1];
                arr[j-1] = temp;
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,8,6,7,5,9};
        print(arr);
        sort(arr);
        print(arr);
    }
}
