package searching.Binary_Search;

public class OrderAgnosticsBC {
    static int orderag(int[] nums , int target)
    {
        int start=0;
        int end=nums.length-1;
        boolean isAsc;
        if(nums[start]<nums[end])
        {
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end)
        {
        int mid=start+(end-start)/2;
        if(target==nums[mid])
        {
            return mid;
        }
        if(isAsc)
        {
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
            if(nums[mid]>target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int[] nums2={9,8,7,6,5,4,3,2,1};
        System.out.println(orderag(nums, 3));
        System.out.println(orderag(nums2, 3));
        
    }
    
}
