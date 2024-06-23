package Array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr2 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arr2.add(i);
        }
        
        
        System.out.println(arr2);
        System.out.println(arr2.contains(1));
        System.out.println(arr2.contains(66));

        arr2.set(2, 33);
        System.out.println(arr2);

        arr2.remove(2);
        System.out.println(arr2);

    }
    
}
