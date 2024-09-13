//268. Missing Number
//https://leetcode.com/problems/missing-number/description/



package sorting.cycle_sort;

public class Missing_number {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missing_number(nums));
        
    }
    static int missing_number(int[] nums)
    {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<nums.length ; i++)
        {
            sum1=sum1+nums[i];
        }
        return sum-sum1;


    }
    
}
