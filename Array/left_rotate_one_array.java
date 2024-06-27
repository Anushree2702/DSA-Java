package Array;

import java.util.Arrays;

public class left_rotate_one_array {
    static void left_rotate(int[] arr)
    {
        
        int temp=arr[0];
        
        for(int i=0;i<arr.length-1; i++)
        {
            
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr1={-1,-100,3,99};
        left_rotate(arr);
        left_rotate(arr1);
        
    }
    
}
