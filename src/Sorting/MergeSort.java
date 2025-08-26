package Sorting;

public class MergeSort {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void merge(int[] arr,int str, int mid,int end){
        int [] merged = new int[end-str+1];
        int idx1 = str;
        int idx2 = mid+1;
        int x=0;
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            } else {
                merged[x++]=arr[idx2++];
            }
        }
        while (idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while (idx2<=end){
            merged[x++]=arr[idx2++];
        }
        for (int i=0, j=str; i< merged.length; i++,j++ ){
            arr[j]=merged[i];
        }
    }
    static void mergeSort(int[] arr, int str, int end){
        if(str>=end){
            return;
        }
        int mid = str + (end-str)/2;
        mergeSort(arr,str,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,str,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        print(arr);
    }
}
