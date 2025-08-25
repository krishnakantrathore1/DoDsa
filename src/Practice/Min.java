package Practice;

public class Min {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 6, 1};
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
