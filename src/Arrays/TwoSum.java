package Arrays;
//aise 2 number jinka sum ek givin number ho
public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {56,78,34,15,43,85,54,10,90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]+arr[j]==100){
                    System.out.println(arr[i]+" " +arr[j]);
                }
            }
        }

    }
}
