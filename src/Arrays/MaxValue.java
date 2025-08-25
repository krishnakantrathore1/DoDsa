package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr={56,98,74,25,78,41,45};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


//        for second greatest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>smax && arr[i]!=max) {
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
