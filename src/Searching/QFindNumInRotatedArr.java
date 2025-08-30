package Searching;

public class QFindNumInRotatedArr {
    static int findNum(int[] arr , int trg){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid]==trg){
                return mid;   // target found at mid
            } else if (arr[mid] < arr[end]) {
                // right half [mid+1 … end] is sorted
                if(trg > arr[mid] && trg <= arr[end]){
                    // target lies in the sorted right half
                    st = mid+1;
                } else {
                    // target must be in left half
                    end = mid-1;
                }
            } else {
                // left half [st … mid-1] is sorted
                if(trg >= arr[st] && trg < arr[mid]){
                    // target lies in the sorted left half
                    end = mid-1;
                } else {
                    // target must be in right half
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        int trg = 7;
        System.out.println(findNum(arr, trg));
    }
}
