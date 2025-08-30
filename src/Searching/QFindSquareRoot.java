package Searching;

public class QFindSquareRoot {
    static int sqrt(int num){
        int st = 0;
        int end = num;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int val = mid*mid;
            if(val==num){
                return mid;
            } else if (val>num) {
                end = mid-1;
//                ans = mid;    // to take the higher value by the num
            }else{
                st = mid+1;
                ans = mid;  // to take the lower value of the num
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 36;
        System.out.println(sqrt(num));
    }
}
