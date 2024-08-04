package searching.Binary_Search;

public class Find_in_mountain_array {
    static int search (int[] arr , int target)
    {
        int peak=peakIndexInMountainArray(arr);
        int firsttry= orderag(arr, target, 0, peak);
        if(firsttry!=-1)
        {
            return firsttry;
        }
        return orderag(arr, target, peak+1, arr.length-1);
    }
    static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while ((start<end)) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //you are in desc part of array  
                //this may be the ans but look at the left
                //this is why mid!=end-1
                end=mid;
            }
            else
            {
                //you are in asec part of array
                //this is not the answer so look at the right
                //this is why start=mid+1
                start=mid+1;
            }
            
        }
        //int the end , start==end  and pointing to the largest number because of the 2 checks above 
        return start;
    }


    static int orderag(int[] nums , int target,int start, int end)
    {
        start=0;
        end=nums.length-1;
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
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr, target));

        
    }
    
}
