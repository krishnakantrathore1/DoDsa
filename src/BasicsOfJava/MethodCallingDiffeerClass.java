package BasicsOfJava;

// java me functions ko method isliye bolte hain kuki java me ham object bna ke method ko call karte hain waise to ham bina
//  object ke bhi call kar skte hain lekin by using object ek standerd tarika he

class greet {
    // agar ham methud ke aage static nhi lagate hain to method ko dusri class me call karte time uska object bnana pdega
    // jab ham static key word ka use kisi object ya variable ke sath karte hain to us obj or var ki memory me dusri copy nhi
    // banti he bina static ke har baar ek new copy banti he
    static void well() {
        System.out.println("Wellcom");
    }
}

public class MethodCallingDiffeerClass {
//    static void well(){
//        System.out.println("Wellcom");
//    }
    public static void main(String[] args) {
//        greet obj = new greet();
//        obj.well();
          greet.well();
//          well();
    }
}
