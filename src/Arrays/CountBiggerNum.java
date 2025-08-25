package Arrays;
//kitne number ek givin number se bde hain
public class CountBiggerNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,10,0};
        int n = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>n){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
