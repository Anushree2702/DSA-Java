package searching.Binary_Search;

public class Sqrt_of_number {
    static int sqrt(int n)
    {
        
               if (n < 2) {
                return n; // Handle small cases directly
            }
        
            int start = 1;
            int end = n / 2;
            int ans = 0; // Variable to store the result
        
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long midSquare = (long) mid * mid; // Use long to prevent overflow
        
                if (midSquare == n) {
                    return mid; // Exact square root found
                } else if (midSquare < n) {
                    start = mid + 1;
                    ans = mid; // Update the answer to the largest integer less than the actual square root
                } else {
                    end = mid - 1;
                }
            }
        
            return ans;
        
                
            }
        

public static void main(String[] args) {
    int n=2147395599;
    System.out.println(sqrt(n));
}
    
}
