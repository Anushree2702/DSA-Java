package Functions;

import java.util.Scanner;

public class int_function {
    static int sum()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter num1");
        int num1 =in.nextInt();
        System.out.println("enter num2");
        int num2 = in.nextInt();
        int sum= num1+ num2;
        return sum;
    }
    public static void main(String[] args) {
        int ans=sum();
        for (int i=0; i<=5; i++)
        {
            System.out.println(ans);
        }
         
        
    }
    
}
