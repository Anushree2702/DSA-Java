package searching.Binary_Search;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class min_rotated_sortedarray {
    
    public static void main(String[] args) {
        int[] arr={8,9,10,11,12,13,14,0,1,2,3,4,5,6,7};
        System.out.println(mini(arr));
        
    }
    static int mini(int[] arr)
    {   
        int start=0;
        int end=arr.length-1;
        
        int minimum=Integer.MAX_VALUE ;
        while(start<=end)
        {
            
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[end])            //optimized part
            {
                minimum=Math.min(minimum,arr[start]);
                break;
            }
            if(arr[start]<=arr[mid])
            {
                minimum=Math.min(minimum,arr[start]);
                start=mid+1;
            }
            else{
                minimum=Math.min(minimum,arr[mid]);
                end=mid-1;
            }
           
                 
        }
        return minimum;

    }
    
}
