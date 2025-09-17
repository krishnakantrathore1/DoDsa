package Strings;
import java.util.*;
public class StringBuilderBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder("Hello");
//        str.append("World");
//        str.setCharAt(2,'y');
//        str.insert(2,'k');
//        str.deleteCharAt(3);
//        str.reverse();
//        str.delete(2,4);

        // input in string  builder

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
    }
}
