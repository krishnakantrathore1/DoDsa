package Arrays;
// rotate the array without using extra space kth time (last ke alement ko starting me lgao isko right rotate bolte hain)
public class RotateArray {
    public static int[] reverse(int[] arr,int i,int j){
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
        int n = arr.length;
        int k=13;   // modulas ki help se ham array ke size se bde number ko chhota kar pate hain
        k=k%n;
        print(arr);
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        print(arr);
    }
}
