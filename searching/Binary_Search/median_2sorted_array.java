package searching.Binary_Search;

import java.util.Arrays;

public class median_2sorted_array {

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2,4};
        
        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        int i=0;
        for(int a: nums1)
        {
            nums[i]=a;
           i++;

        }
        for(int a: nums2)
        {
            nums[i]=a;
            i++;
        }
        Arrays.sort(nums);
        int c=nums.length;
        System.out.println(Arrays.toString(nums));
        if(c%2!=0)
        {
            System.out.print( nums[c/2]);
        }
        else
        {
            double b=nums[c/2-1]+nums[c/2];
            System.out.print(b/2);
           
        }
        
        
    }
    
}
