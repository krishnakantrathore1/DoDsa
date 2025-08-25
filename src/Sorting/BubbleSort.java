package Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                flag = true;
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                return;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        bubbleSort(arr);
        print(arr);
    }
}
