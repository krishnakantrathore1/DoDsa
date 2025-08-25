package ArrayList;

// we use wrapper classes because of some java function do not work on premitive(int) data type
// arrayList and stack queue take input only in object form

public class WrapperClass {
    public static void main(String[] args) {
        Integer a  = new Integer(3);  // old :- creat object every time even it is already creted == do not use it
        Integer b = Integer.valueOf(4);  //  new :- do nnot create object when object is already present
        Integer c = 4;                     // it is same as new but in sort form
        System.out.println(b);
    }
}
