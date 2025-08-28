package Sorting;

public class RadixSort {
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
    static void countingSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        // making a frequency array
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }
        // making prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        // places each element in its correct position according to cumulative counts
        for (int i = n-1; i >= 0; i--) {
            int idx = count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);
        // har digit ko uski correct position pe dalna
        for (int place = 1; max/place > 0; place*=10) {
            countingSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3548, 92, 48965, 70, 7, 600000, 1};
        radixSort(arr);
        print(arr);

    }

}
