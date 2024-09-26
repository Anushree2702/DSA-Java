package Recursion;

public class fibonacci_series {
    public static void main(String[] args) {
        System.out.println(fibonac(6));
        
    }
    static int fibonac(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibonac(n-1)+fibonac(n-2);
    }
    
}
