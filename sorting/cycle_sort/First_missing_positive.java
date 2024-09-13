//41. First Missing Positive
//https://leetcode.com/problems/first-missing-positive/description/




package sorting.cycle_sort;

public class First_missing_positive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int[] nums1={3,4,-1,1};
        System.out.println(firstMissingPositive(nums1));
        System.out.println(firstMissingPositive(nums));
        
    }
    static int firstMissingPositive(int[] nums) {
        int n=nums.length;
         int i=0;
        while(i<nums.length)
        {
         int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else
            {
               i++; 
            }

        }
        for(int j=0; j<nums.length ; j++)
        {
            if(nums[j]!=j+1)
            {
                return j+1 ;
            }
        }
        return n+1;
       
        
    }


    
}
