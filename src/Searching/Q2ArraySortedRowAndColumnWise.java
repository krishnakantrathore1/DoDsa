package Searching;
// leetcode problem 240
public class Q2ArraySortedRowAndColumnWise {
    static boolean binarySearch(int[][] arr, int trg){
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = m-1;
        while(i<n && j>=0){
            if(trg==arr[i][j]){
                return true;
            } else if (trg < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,4,6},{3,5,8},{4,6,9}};
        int trg = 4;
        System.out.println(binarySearch(arr,trg));
    }
}
