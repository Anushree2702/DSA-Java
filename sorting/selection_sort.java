package sorting;

import java.util.Arrays;

public class selection_sort {
    
    public static void main(String[] args) {
        int[] nums={5,4,3,2,66,70,78,99,11,22,33,33,4,5,6,90,1};
        selection(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void selection(int[] nums)
    {
        for(int i=0 ;i <nums.length -1; i++)
        {
            int start=i;
            int index=getminindex(nums,start,nums.length-1);
            swap(nums, start, index);
        }

    }
    static int getminindex(int[] nums , int start , int end)
    {
        int min=start;
        for(int i=start+1; i<=end ; i++)
        {
            if(nums[min]>nums[i])
            {
                min=i;

            }
        }
        return min;
    }
    static void swap(int[] nums , int first , int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    
}
