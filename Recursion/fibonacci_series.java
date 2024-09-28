/*Time Complexity:
Time Complexity: O(2^n)
This is because the number of calls doubles at each level of recursion.
Space Complexity: O(n) (due to the recursion depth of n, where n is the input number).*/

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
