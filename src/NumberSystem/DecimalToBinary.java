package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int Decimal_num = in.nextInt();
        int Ans = 0;
        int power = 1;  // 10^0=1 and show on multiply by 10
        while (Decimal_num!=0){
            int Parity=Decimal_num%2;
            Ans+=Parity*power;
            Decimal_num/=2;
            power*=10;
        }
        System.out.println("Binary Number: ");
        System.out.println(Ans);
    }
}
