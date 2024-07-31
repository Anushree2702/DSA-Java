package searching.Linear_search;

public class count_evendigits {
    
        static int findNumbers(int[] nums) {
            int count=0;
            for(int num:nums)
            {
                if(even(num))
                {
                    count++;
                }
                
    
            }
            return count;
            
        }
        static boolean even(int num)
        {
            int a=digits(num);
            if(a%2==0)
            {
                return true;
            }
            return false;
        }
        static int digits(int num)
        {
            int count=0;
            while(num>0)
            {
                count++;
                num=num/10;
            }
            return count;
        }
    

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896,66,45};
        System.out.println(findNumbers(nums));


    }
    
}
