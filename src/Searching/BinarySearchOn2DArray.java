package Searching;
// leetcode problem 74
public class BinarySearchOn2DArray {
    static boolean binarySearch(int[][] arr, int trg){
        int n = arr.length;
        int m = arr[0].length;
        int st = 0, end = n*m-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int midEl = arr[mid/m][mid%m];
            if(midEl==trg){
                return true;
            } else if (midEl<trg) {
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,4,6},{10,13,16},{23,25,27}};
        int trg = 13;
        System.out.println(binarySearch(arr,trg));
    }
}
