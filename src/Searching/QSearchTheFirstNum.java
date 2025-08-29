package Searching;

public class QSearchTheFirstNum {
    static int firstOccurrence(int[] arr, int trg , int st, int end){
        int ans=-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(trg==arr[mid]){
                ans=mid;
                end=mid-1;
            } else if (trg<arr[mid]) {
                end = mid-1;
            }else if(trg>arr[mid]){
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,5,5,5,10,23,45,47,47,83};
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int trg =5;
        System.out.println(firstOccurrence(arr,trg,st,end));
    }
}
