package Functions;

import java.util.Scanner;

public class Armstrong_number {

    static boolean Armstrong(int n)
    {
        int temp=n;
        int m=0;
        while(n>0){
        int c=n%10;
        m=c*c*c+ m;
        n=n/10;
        }

        return m==temp;

    }
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("enter a three digit number ");
        //int n=in.nextInt();
        //Armstrong(n);
        for(int i=100; i<=999;i++)
        {
            if(Armstrong(i))
            {
                System.out.println(i);

            }

        }
        

        
    }
    
}
