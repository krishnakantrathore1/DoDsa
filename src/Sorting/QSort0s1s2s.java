package Sorting;

public class QSort0s1s2s {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                count_0++;
            } else if (arr[i]==1) {
                count_1++;
            } else {
                count_2++;
            }
        }
        int k = 0;
        while(count_0>0){
            arr[k]=0;
            count_0--;k++;
        }
        while(count_1>0){
            arr[k]=1;
            count_1--;k++;
        }
        while(count_2>0){
            arr[k]=2;
            count_2--;k++;
        }
    }
    static void sort2(int[] arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;low++;
            } else if (arr[mid]==2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }else {
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,0,1,2,1};
        print(arr);
//        sort(arr);
        sort2(arr);
        print(arr);
    }
}
