package HashMap;

import java.util.*;

public class HashMapDeclaration {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Krishna");
        map.put(2,"Jerry");
        map.put(3,"Tom");
        map.put(4,"Aniket");
        map.put(5,"Satyam");

        // traverse the hashmap
//        System.out.println(map);
//        for (Map.Entry<Integer,String> e : map.entrySet()){
////            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        
        
        // entering the values in hashmap
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enetr the number of Key & Values");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the Key:");  // taking input for key
//            int key = sc.nextInt();
//            sc.nextLine();
//
//            System.out.println("Enter the value:");   // taking input for value
//            String value = sc.nextLine();
//            map.put(key,value);
//        }
//        System.out.println(map);


        // traversing by the loop

        for (int i = 1; i < map.size()+1; i++) {
            System.out.print(i+" : ");
            System.out.println(map.get(i));
        }

    }
}
