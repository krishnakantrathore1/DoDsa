package OOPS;

// kisi class ka access modifier mention nhi hota uss class ka default access modifier "default" hota he
class student {
//    int age = 23;
//    String name = "Krishna";
    int age;
    String name;

}
// ek java file ke ander sirf ek hi class ke aage "public" access modifier lag skta he jo ki main class hoti he or main class
// ka name or java file ka name same hona chahiye ( jaise ki yha main class ka name main he or java file ka name main.java he)
public class Main {
    public static void main(String[] args) {
        // phla object( class ke tamplate ko use karke kitne bhi object bna skte hain)
        // constructor ka name or class ka name same hona chahiye ( class or constructor ka syntex almost same hota he lekin
        // constructer ka koi  return type nhi hota he
        // new keyword is used to allocate memory in java
        student obj1 = new student();
        obj1.age = 23;
        obj1.name = "Krishna";
        System.out.println(obj1.age+" "+obj1.name);

        student obj2 = new student();
        obj2.age = 24;
        obj2.name = "Bhawna";
        System.out.println(obj2.age+" "+obj2.name);
    }
}
