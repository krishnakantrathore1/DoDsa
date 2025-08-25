package Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {56, 78, 34, 15, 43, 85, 54, 10, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[i] + arr[j] + arr[k] == 100) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}
