package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[3]);

        String[] arr1 =new String[4];
        System.out.println(arr1[3]);

        Scanner in= new Scanner(System.in);


        int[] arr2 = new int[5];
        System.out.println("enter 5 elements");
        for ( int  i = 0; i < arr2.length; i++) {
            arr2[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
            
        }

        for(int num :arr2)
        {
            System.out.print(num + " ");
        }
    }
    
}
