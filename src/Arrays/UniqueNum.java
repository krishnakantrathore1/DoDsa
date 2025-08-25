package Arrays;

public class UniqueNum {
    public static void main(String[] args) {
//         finding unique element in array
        int[] arr = {34,54,65,54,78,34,46};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                System.out.print(arr[i]+", ");
            }
        }



    }
}
