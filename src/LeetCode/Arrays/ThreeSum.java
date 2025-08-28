package LeetCode.Arrays;
import static Sorting.BubbleSort.bubbleSort;

public class ThreeSum {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] threeSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[3];
        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            int j = i+1;int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    ans[2]=arr[k];
                    return ans;
                }
                else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int[] res = threeSum(arr);
        print(res);
    }
}
