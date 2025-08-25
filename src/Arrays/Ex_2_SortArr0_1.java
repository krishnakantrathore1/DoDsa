package Arrays;

public class Ex_2_SortArr0_1 {
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,0,1,0,0,0};
        System.out.println("Orginal Array: ");
        print(arr); // orginal array
        int n= arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            } else if (arr[i]<arr[j]) {
                i++;j--;
            } else if (arr[i]==1) {
                j--;
            }else if (arr[i]==0){
                i++;
            }
        }
        System.out.println("Sorted Array");
        print(arr);
    }
}
