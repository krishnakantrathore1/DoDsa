package BasicsOfJava;

import java.util.Scanner;

public class functions {
    public static int fact(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
// ye quetion mene adha chhod diya he
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print((fact(i))/(fact(j)*fact(i-j)));
            }
            System.out.println();
        }




    }
}
