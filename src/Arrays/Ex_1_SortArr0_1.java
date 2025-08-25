package Arrays;

public class Ex_1_SortArr0_1 {
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,1,0,0,0};
        int cnt =0;
        System.out.println("Orginal Array: ");
        print(arr); // orginal array
        // coount the number of zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                cnt++;
            }
        }
        // refilling the array
        for (int i = 0; i < arr.length; i++) {
            if(i<cnt){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        // printing the array
        System.out.println("Orginal Array: ");
        print(arr); // after change

    }
}
