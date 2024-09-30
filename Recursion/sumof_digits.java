package Recursion;

public class sumof_digits {
    
    public static void main(String[] args) {
        System.out.println(sumofdig(12345));
        
    }
    static int sumofdig(int num)
    {
        
        
        if(num==0)
        {
            return 0;
        }
        return num%10 + sumofdig(num/10);
    }
    
}
