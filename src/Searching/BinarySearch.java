package Searching;

public class BinarySearch {
    static int binarySearchRec(int[] arr, int trg , int st, int end){
        int mid = st + (end-st)/2;
        if(st>end){
            return -1;
        } else if (trg>arr[mid]) {
            return binarySearchRec(arr,trg,mid+1,end);
        } else if (trg<arr[mid]) {
            return binarySearchRec(arr, trg, st, mid-1);
        } else {
            return mid;
        }
    }
    static int binarySearch(int[] arr, int trg , int st, int end){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(trg==arr[mid]){
                return mid;
            } else if (trg<arr[mid]) {
                end = mid-1;
            }else if(trg>arr[mid]){
                st = mid+1;
            }else{
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {10,23,45,47,83};
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int trg =47;
//        System.out.println(binarySearchRec(arr,trg,st,end));
        System.out.println(binarySearch(arr,trg,st,end));

    }
}
