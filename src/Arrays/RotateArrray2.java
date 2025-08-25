package Arrays;
// with using extra array (space)
public class RotateArrray2 {
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n = arr.length;
        int k = 3, j=0;
        print(arr);
        int[] arr2 = new int[n];
        for (int i = n-k; i < n; i++) {
            arr2[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n-k; i++) {
            arr2[j] = arr[i];
            j++;
        }
        print(arr2);

    }
}
