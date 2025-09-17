package Strings;

public class EqualsTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
//        System.out.println(s1==s3);          // location compare karta he
        System.out.println(s1.equals(s3));      // value compare karta he
    }
}
