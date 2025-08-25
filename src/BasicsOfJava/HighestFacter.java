package BasicsOfJava;

import java.util.Scanner;

public class HighestFacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        ======================highest facter=======================


//        int n = in.nextInt();
//        int hf=1;
//        for (int i = 1; i < n; i++) {
//            if(n%i ==0){
////                System.out.println(i);
//                hf=i;
//
//            }
//        }
//
//        System.out.println(hf);



//====================highest facter optimize===================

        int n = in.nextInt();
        int hf=n;
        for (int i = n-1; i >=1; i--) {
            if(n%i ==0){
//                System.out.println(i);
                hf=i;
                break;

            }
        }

        System.out.println(hf);







    }
}
