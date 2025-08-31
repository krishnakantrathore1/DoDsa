package Searching;
//leetcode problem 852
public class QPeakElementOfMountainArray {
    static int peak(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        int ans=0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans = mid+1;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] arr = {1,12,15,23,33,24,15,13,9,1};
        int[] arr = {0,2,1,0};
        System.out.println(peak(arr));
    }
}
