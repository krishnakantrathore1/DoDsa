package Recursion;

public class FirstKMultiples {
    static void kMulti2(int num, int k){
        if(k==1){
            System.out.print(num+" ");
            return;
        }
        kMulti2(num,k-1);
        System.out.print(num*k+" ");
    }
    static int kMulti(int num, int k){
        // ulta print kar rha he ye
        if (k==1) return num;
        System.out.print(num*k+" ");
        return kMulti(num,k-1);
    }
    public static void main(String[] args) {
//        System.out.println(kMulti(3,5));
        kMulti2(3,5);
    }
}
