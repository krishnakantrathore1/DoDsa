package BasicsOfJava;

class algbra{
    // function ko call karne ke liye constructor ki need hoti he agar ham nhi bnate to java hmare liye default constructor
    // bnati he . yha ham khudka constructor bnayenge

    int a;
    int b;
// is trh ham khud ke constructor ki help se har function me values daal skte hain
    algbra(int x, int y){
        a=x;
        b=y;
        System.out.println("constructor is called");
    }
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }

}

public class Methods {
    public static void main(String[] args) {
        algbra obj = new algbra(3,5);
        System.out.println(obj.sum());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
    }
}
