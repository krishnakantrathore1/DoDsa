package Arrays;
// index number tak har value ka sam uss index me store karna he
public class PrefixOrRunning_Sum {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] pref = prefixSum(arr);
        print(pref);
    }
}
