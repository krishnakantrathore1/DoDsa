package Sorting;

public class CountingSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findMax(int[] arr){
        int n = arr.length;
        int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void basicCountingSort(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        int[] count = new int[max+1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++]=i;
            }
        }
    }
    static void countingSort(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        int[] output = new int[n];
        // making a frequency array
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // making prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        // places each element in its correct position according to cumulative counts
        for (int i = n-1; i >= 0; i--) {
            int idx = count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 0, 7, 6, 1};
//        basicCountingSort(arr);
        countingSort(arr);
        print(arr);
    }
}
