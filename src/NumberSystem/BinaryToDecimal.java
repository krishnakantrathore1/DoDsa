package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int Binaru_num = in.nextInt();
        int Ans = 0;
        int power = 1;  // 2^0=1 and show on multiply by 2
        while (Binaru_num!=0){
            int Unit_digit=Binaru_num%10;
            Ans+=Unit_digit*power;
            Binaru_num/=10;
            power*=2;
        }
        System.out.println("Decimal Number: ");
        System.out.println(Ans);
    }
}
