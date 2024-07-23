package searching.Linear_search;

public class linear_search {
    static int linear_Search1(int[] arr , int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==target)


            {
                
                return i;
            }
            
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={ };
        int target=0;
        System.out.println(linear_Search1(arr, target));
        
    }   
}