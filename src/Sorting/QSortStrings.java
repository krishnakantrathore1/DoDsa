package Sorting;

public class QSortStrings {
    public static void print(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sortString(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n; i++) {
            int min_index= i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index=j;
                }
            }
            String temp = fruits[min_index];
            fruits[min_index] = fruits[i];
            fruits[i] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"banana","apple","mangao","lichi"};
        sortString(fruits);
        print(fruits);
    }
}
