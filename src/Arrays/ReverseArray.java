package Arrays;
// reverse the array without using the extra array
public class ReverseArray {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {23,54,25,67,47,43,5,36,38,82,92,76};
        print(arr);
        int n = arr.length;
        int i = 0; int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        print(arr);
    }
}
