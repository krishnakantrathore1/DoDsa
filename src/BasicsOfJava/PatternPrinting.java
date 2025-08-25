package BasicsOfJava;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        System.out.println("Enter the number of colunms");
        int m = in.nextInt();

//       for squre

//        for (int i = 0; i < n; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < m; j++) {
//                System.out.print(" * ");
//            }
//        }

// for triangle

//        for (int i = 0; i < n; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < m; j++) {
//                System.out.print(" * ");
//            }
//        }

//        wap for number

//                for (int i = 1; i < n; i++) {
//            System.out.println(" ");
//            for (int j = 1; j < m; j++) {
//                System.out.print(j);
//            }
//        }

//        for (int i = 1; i < n; i++) {
//            System.out.println(" ");
//            for (int j = 1; j < m; j++) {
//                System.out.print(i);
//            }
//        }


//        wap alphabet pattern

//        for (int i = 1; i < n; i++) {
//
//            for (int j = 1; j < m; j++) {
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println(" ");
//        }

//        wap for triangle

//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }

//        wap for alphanumaric triangle

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(i%2!=0) {
//                    System.out.print(" " + j + " ");
//                } else {
//                    System.out.print(" " +(char)( j +64) + " ");
//                }
//            }
//            System.out.println(" ");
//        }

        //        wap for ulta triangle

//        for (int i = 1; i <= n; i++) {
//
//            for (int j = m; j >= i; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }

// number of triangle

//        int a=1;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(a+" ");
//                a++;
//            }
//            System.out.println(" ");
//
//        }

//        0 or 1 triangle

//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0)  ){
//                    System.out.print(1);
//
//                }else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//
//        }

//        reverse triangle

//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//   reverse triangle of number

//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }


//  rombus

//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= m; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        piramid


        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }




    }
}
