package searching.Binary_Search;

public class Position_of_an_element_infiniteArray {
    public static void main(String[] args) {
        int[] nums={3,5,7,9,10,90,100,130,140,160,170};
        int target=100;
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target)
    {
        int start=0;
        int end=1;
        while(target>nums[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;

        }
        return binarysearch(nums, target, start, end);
    }

    

static int binarysearch(int[] nums, int target , int start , int end)
{
   
    while(start<=end)
    {
    int mid=(start)+(end-start)/2;
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
}

