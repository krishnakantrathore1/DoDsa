package Arrays;

public class EvenInFront {
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={6,5,8,9,7,4,3,6,9,2};
        System.out.println("Orginal Array: ");
        print(arr); // orginal array
        int n= arr.length;
        int i=0,j=n-1;    // we called it two pointer approach
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            } else if (arr[i]%2==0 && arr[j]%2==0) {
                i++;
            }else if ((arr[i]%2!=0 && arr[j]%2!=0) || (arr[i]%2==0 && arr[j]%2!=0) ){
                j--;
            }
        }
        System.out.println("Even Number in front in Array");
        print(arr);
    }
}
