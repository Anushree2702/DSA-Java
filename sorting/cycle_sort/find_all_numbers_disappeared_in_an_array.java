//448. Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/


package sorting.cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_disappeared_in_an_array {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
       System.out.println(numdisappeared(nums));
        
    }
    static List<Integer> numdisappeared(int[] nums)
    {
        List<Integer> result=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            
            }
        }
        for(int j=0;j<nums.length ; j++)
        {
            if(nums[j]!=j+1)
            {
                result.add(j+1);
            }
        }
        return result;
    }
    
}
