package Array;

public class second_largest_second_smallest {
     //array doesnot include duplicate values


    static int max(int[] arr)
    {
        int fmax=arr[0];
        int smax=-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>=fmax)
            {
                smax=fmax;
                fmax=arr[i];
            }
            
        }
        System.out.println("first largest number is :"+ fmax);
        System.out.println("second largest number :"+smax);
        
        return fmax;
        
    }
    static void secondsmallest(int[] arr,int max)
    {
        
        int fsmall=arr[0];
        int ssmall=max;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<fsmall)
            {
                ssmall=fsmall;
                fsmall=arr[i];
            }
            else if(arr[i]!=fsmall && arr[i]<ssmall )
            {
                ssmall=arr[i];
            }
            
        }
        System.out.println("first smallest no. is :"+fsmall);
        System.out.println("second smallest no. is:"+ssmall);

    }
    public static void main(String[] args) {


        int[] arr={19,2,3,4,64,58,89,9,100,1,100,1};
        int a=max(arr);
        secondsmallest(arr,a);
        
    }
    
}
