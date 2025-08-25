package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        // add new elements
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        // get element in index i
//        System.out.println(a.get(2));

        // printing the arrayList by loop
//        for (int i = 0; i < a.size(); i++) {
//            System.out.print(a.get(i)+" ");
//        }

        // printind the arrayList Directly
//        System.out.println(a);

        // add element at any index
        a.add(1,8);
        System.out.println(a);
        // modify element at index i
        a.set(0,100);
        System.out.println(a);

        // removing an element at index i
        a.remove(1);
        System.out.println(a);

        // removing an element by the value
        System.out.println(a.remove(Integer.valueOf(100))); // return a boolean value true if present and remove it else opposite
        System.out.println(a);

        // checking an element is exists
        // or bhi bahut functoin hain zaroorat ke tim epe use kar lenge unhe

    }
}
