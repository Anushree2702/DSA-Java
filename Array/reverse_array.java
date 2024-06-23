package Array;

import java.util.Arrays;

public class reverse_array {
    static void swap(int[] arr, int index1 ,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    static void reverse(int[] arr)
        {
            int start=0;
            int end=arr.length -1;
            while(start<end)
            {
                swap(arr,start,end);
                start++;
                end--;
            }
            
        }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={1,2,3,4,5,6};
        
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        
        
    }
    
}
