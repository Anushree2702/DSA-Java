package sorting.cycle_sort;

import java.util.Arrays;

public class cyclic_sort {
    
    static void sort(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            //int correct=nums[i]-1;                 //if range is from 1 to n
            int correct=nums[i];                   //if range is from 0 to n
            if( nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={3,0,5,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    
}
