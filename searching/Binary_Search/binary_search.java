package searching.Binary_Search;

public class binary_search {
    static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
        int mid=(start+end)/2;
        if(target==nums[mid])
        {
            return mid;
        }

        if(target<nums[mid])
        {
            end=mid-1;
        }
        if(target>nums[mid])
        {
            start=mid+1;
        }
        }
        return -1;

        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        System.out.println(search(arr,6));
    }

    
}
