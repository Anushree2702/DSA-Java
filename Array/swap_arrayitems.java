package Array;

import java.util.Arrays;
import java.util.Scanner;

public class swap_arrayitems {

    static void swap(int[] arr, int index1 ,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number of elements you want to enter in an array ;");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements in an array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            
        }
        
        System.out.println(Arrays.toString(arr));
            
        
        swap(arr,1, 2);

        System.out.println(Arrays.toString(arr));


       

        
    }
    
}
