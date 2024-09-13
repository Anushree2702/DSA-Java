//645. Set Mismatch
//https://leetcode.com/problems/set-mismatch/description/



package sorting.cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class set_mismatch {
     public static void main(String[] args) {
        int[] nums={1,2,2,4};
        
        System.out.println(Arrays.toString(duplicate(nums)));
        
    }
    static int[] duplicate(int[] nums)
    {
        List<Integer> result =new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;                 //if range is from 1 to n
            //int correct=nums[i];                   //if range is from 0 to n
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
        for(int j=0; j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    
    
}
