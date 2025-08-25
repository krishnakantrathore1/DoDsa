package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseArrayList {
    static void reverse(ArrayList<Integer> a){
        int n = a.size();
        int i=0,j=n-1;
        while(i<j){
            Integer temp = Integer.valueOf(a.get(i));
            a.set(i,a.get(j));
            a.set(j, temp);
            i++;j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(List.of(1,2,3,4,5));
        System.out.println(a);
        reverse(a);
        System.out.println(a);
//        Collections.reverse(a);
//        System.out.println(a); // reverse karke fir se sidha
    }
}
