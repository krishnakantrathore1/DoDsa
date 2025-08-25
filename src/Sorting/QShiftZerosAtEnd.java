package Sorting;

public class QShiftZerosAtEnd {
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
                if (arr[j]==0 && arr[j+1]!=0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 7, 6, 1};
        bubbleSort(arr);
        print(arr);
    }
}
