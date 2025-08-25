package Arrays;

public class RepeatedValue {
    static int repeat(int []arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        return arr[i];
                    }
                }
            }
          return -1;
    }
    public static void main(String[] args) {
        int[] arr = {34,54,65,54,78,34,46};
//        int[] arr2= arr.clone();   // clone function ko ham array ko memery me clone karne ke liye use karte hian(yha iska koi use nhi he)

//        System.out.println(repeat(arr));



        // finding all repeated element in array
//        int[] arr = {34,54,65,54,78,34,46};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    System.out.print(arr[i]+", ");
//                }
//            }
//        }

        // finding only first repeated element in array
        // top pe yhi cheez function ko use krke ki he
//        int[] arr = {34,54,65,54,78,34,46};
//        outer:
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    System.out.print(arr[i]);
//                    break outer;
//                }
//            }
//        }


    }
}
