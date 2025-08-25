package BasicsOfJava;

import java.util.Scanner;

public class Swap {
    public static void swappy(int a,int b){
        int c;
        System.out.println("values before swap");
        System.out.println("a= "+a+", b= "+b);
        c=b;
        b=a;
        a=c;
        System.out.println("values after swap");
        System.out.println("a= "+a+", b= "+b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n1 = in.nextInt();
        System.out.print("Enter the second number:");
        int n2 = in.nextInt();

        swappy(n1,n2);


    }
}
