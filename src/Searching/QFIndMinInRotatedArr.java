package Searching;

public class QFIndMinInRotatedArr {
    static int findMin(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[end]) {
                st = mid + 1;   // min lies in right half
            } else {
                end = mid;      // min lies at mid or in left half ( we do not do mid-1 because it take risking to avoid the minimum element on the mid)
            }
        }
        return arr[st]; // st == end → min element
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        System.out.println(findMin(arr));
    }
}
