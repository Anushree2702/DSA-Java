package Array;

public class three_consecutive_odds {
    static boolean threeConsecutiveOdds(int[] arr) {
        
        if(arr.length==3)
        {

           for (int i=0;i<1 ;i++)
        {
            
               
                if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
                {
                    System.out.println("true");
                    
                    return true;
                    
                }
        }
        }
        if(arr.length!=3)
        {
        
        for (int i=0; i<arr.length-3; i++)
        {
            
               
                if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
                {
                    System.out.println("true");
                    
                    return true;
                    
                }
        }
        }
        
        return false;
        

            

        }
    public static void main(String[] args) {
        int[] arr={102,780,919,897,901};
        int[] arr1={2,4,5,7,23};
        threeConsecutiveOdds(arr1);
        //threeConsecutiveOdds(arr);
    }
    
}
