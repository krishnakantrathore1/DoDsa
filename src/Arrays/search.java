package Arrays;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        int n = in.nextInt();
        int[] arr={34,56,76,7,56,3};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n){
                flag = true;
                break;
            }
        }
        if (flag==false){
            System.out.println("nhi mila");
        }else {
            System.out.println("mil gya");
        }

    }
}
