package Array;

public class max_element_inarray {
    static void maxRange(int[] arr, int start , int end)
    {
        int max=arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
            

        }
        System.out.println("maximum element is :"+ max);
    }


    static void max(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
           
        }
        System.out.println("maximum element is :"+ max);
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,58,64};
        max(arr);
        maxRange(arr,3,6);
        
    }
    
}
