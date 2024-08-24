package searching.Binary_Search;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class Search_in_RotatedSorted_ArrayII {
    static boolean search(int [] arr ,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
                if(arr[mid]==target)
                {
                    return true;
                }
                if(arr[start]==arr[mid] && arr[mid]==arr[end])
                {
                    start++;
                    end--;
                    continue;
                }
                if(arr[start]<=arr[mid])
                {
                if(arr[start]<=target && arr[mid]>=target)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && arr[end]>=target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            

        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,1,2,2,3,3};
        System.out.println(search(arr, 4));
    }
    
}
