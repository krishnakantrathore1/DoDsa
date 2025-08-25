package Recursion;

public class Power {
    static int power(int p,int q){
        if(q==0) return 1;
        return power(p,q-1)*p;
    }
    static int power2(int p,int q){
        if(q==0) return 1;
        if (q%2==0) {
            return power(p, q / 2) * power(p, q / 2);
        }
        return p*power(p, q / 2) * power(p, q / 2);
    }
    public static void main(String[] args) {
        System.out.println(power(4,5));
        System.out.println(power2(4,5));
    }
}
