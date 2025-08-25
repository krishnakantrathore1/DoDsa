package Sorting;

public class SelectionSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]< arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index!=i) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        int[] ans = selectionSort(arr);
        print(ans);
    }
}
