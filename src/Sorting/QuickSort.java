package Sorting;

public class QuickSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = pivot; // arr[high]
        arr[high] = temp;
        return i;
    }
    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        int n = arr.length;
        quickSort(arr,0,n-1);
        print(arr);
    }
}
