package searching.Binary_Search;


public class bruteforce_first_last_position_of_element {
    static int[] searchRange(int[] nums, int target) {
        int count=0;
        int i;
        int j;
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        if(search(nums,target))
        {

        for (i=0; i<nums.length ; i++ )
        
        {
           
            if(nums[i]==target)
            {
               
               break;
            }
        }
        for( j=nums.length-1; j>0 ; j--)
        {
            if(nums[j]==target)
            {
              
                break;
            }
        }
        return new int[]{i,j};
        }
        return new int[]{-1,-1} ;
        
    }
     static boolean search(int[] nums, int target)
    {
       for(int a=0 ;a<nums.length ; a++ )
       {
        if (target==nums[a])
        {
            return true;
        }
       }
       return false;

    }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(searchRange(nums, target));
        
    }
    
    
}
