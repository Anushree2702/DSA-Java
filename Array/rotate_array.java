package Array;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args ) {
        int[] nums={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=3;
        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
        
    }
    static void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        reverse(nums, 0,n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        
    }
    static void reverse(int[] nums , int start , int end)
    {
        while(start<=end)
        {
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    
}
