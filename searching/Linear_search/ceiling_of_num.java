package searching.Linear_search;

public class ceiling_of_num {
    static int ceiing(int[] nums, int target)
    {
        int i;
        if(target>nums[nums.length-1])
        {
            return -1;
        }
        
        
        if(ispresent(nums, target))
        {
        
        
        for(i=0; i<nums.length ; i++)
        {
            if(nums[i]==target)
            {
                return nums[i];
            }
        }
    }
    else 
    {
        for(i=0; i<nums.length ; i++)
        {
            if(nums[i]>target)
            {
                
                break;
            }
        }
   
    return nums[i];
    }
    return -1;
}
    static boolean ispresent(int[] nums , int target)
    {
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] nums={1,2,3,5,7,88,555};
        int target=556;
        System.out.println(ceiing(nums, target));
        
    }
    
}
