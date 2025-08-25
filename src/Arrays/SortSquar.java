package Arrays;
// nagative values bhi ho skti hain..given array already sorted hona chahiye..answer non-decreasing order me cahiye
public class SortSquar {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] sortSquar(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int k = n-1;
        int left =0, right = n-1;
        while(left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-10,-4,-2,1,4,6};  // non-decreasing sorted array
        print(arr);
        int[] ans = sortSquar(arr);
        print(ans);
    }
}
