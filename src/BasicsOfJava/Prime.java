package BasicsOfJava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        ============prime or not=================

        int n = in.nextInt();
        boolean flag=false;

        for (int i = 2; i < n; i++) {
            if (n%i==0){
                flag=true;
            }
        }
        if (n==1){
            System.out.println("neither is not prime nor composite");
        }
        else if (flag == false){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is composite");
        }










    }
}