package Functions;

import java.util.Scanner;

public class simplefunction {
    static void sum()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter num1");
        int num1 =in.nextInt();
        System.out.println("enter num2");
        int num2 = in.nextInt();
        int sum= num1+ num2;
        System.out.println("the sum of 2 numbers is:"+ sum);
    }
    public static void main(String[] args) {
       
        for (int i=0; i<=5; i++)
        {
            System.out.println("hello");
        }
        sum();
           
        
    }
    
}
