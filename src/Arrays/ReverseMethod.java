package Arrays;

public class ReverseMethod {
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return arr;
    }
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        print(arr);
        reverse(arr);
        print(arr);
    }
}
