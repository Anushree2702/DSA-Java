package Functions;

import java.util.Scanner;

public class prime_number {

    static boolean prime(int a)
    {
        if(a<=1) {
            return false;
        }
        int c=2;
        while (c*c<=a) {
            if(a%c==0)
            {
                return false;
            }
        }
        c++;
        if(c*c>a)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        boolean ans=prime(a);
        System.out.println(ans);
        
    }
    
}
