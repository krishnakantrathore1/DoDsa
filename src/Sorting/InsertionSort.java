package Sorting;

public class InsertionSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        insertionSort(arr);
        print(arr);
    }
}
