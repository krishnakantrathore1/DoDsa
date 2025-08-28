package Sorting;

public class QPlaceNagativeInFront {
    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void moveNagative(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        while (i<j){
            if(arr[i]>=0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            } else if (arr[i]<0) {
                i++;
            }else if (arr[j]>=0) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,3,0,-8,6,7,-5,0,-9};
        print(arr);
        moveNagative(arr);
        print(arr);
    }
}
