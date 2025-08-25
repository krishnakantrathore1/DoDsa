package Arrays._2DArrays;

public class SumOfTwoArray {
    public static void print(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] sum(int [][] arr1,int[][] arr2){
        int n = arr1.length;
        int[][] sum= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{5,6,7},{3,4,5}};
        int[][] arr2 = {{1,2,3},{5,6,7},{3,4,5}};
        int[][] sum= sum(arr1,arr2);
        print(sum);
    }
}
