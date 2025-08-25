package Recursion;

public class OneToNSum {
    // sum of all
    static int sum(int n){
        if (n==0)return 0;
        return sum(n-1)+n;
    }

    // one time add another time subtract
    static int alternateSum(int n){
        if (n==0) return 0;
        if (n%2==0) {
            return alternateSum(n-1)-n;
        }
        return alternateSum(n-1)+n;
    }
    public static void main(String[] args) {
//        System.out.println(sum(5));
        System.out.println(alternateSum(5));
    }
}
