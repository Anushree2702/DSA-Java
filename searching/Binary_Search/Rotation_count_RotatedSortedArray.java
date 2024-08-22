package searching.Binary_Search;

public class Rotation_count_RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={8,9,11,12,13,1,2,3,4,5,6,7};
        System.out.println(mini(arr));
        
    }
    static int mini(int[] arr)
    {   
        int start=0;
        int end=arr.length-1;
        int index=-1;
        
        int minimum=Integer.MAX_VALUE ;
        while(start<=end)
        {
            
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[end])            //optimized part
            {
               if(arr[start]<minimum)
               {
                minimum=arr[start];
               
                index=start;
               }
                break;
            }
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<minimum)
                {
                 minimum=arr[start];
                
                index=start;
                }
                start=mid+1;
            }
            else{
                if(arr[mid]<minimum)
               {
                minimum=arr[mid];
               
                index=mid;
               }
                end=mid-1;
            }
           
                 
        }
        return minimum;

    }
}
