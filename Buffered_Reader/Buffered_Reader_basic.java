/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered__Reader {
    public static void main(String[] args) throws IOException {
        int f=1;
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        String input=bfn.readLine();
        int a=Integer.parseInt(input);
        int b=Integer.parseInt(input);
        int s=a+b;
        System.out.println(s);

        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if(a==0 || a==1)
        {
            System.out.println(1);
        }
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
    
}*/

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffered__Reader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a word or number: ");
            String input = reader.readLine();

            String reversed = new StringBuilder(input).reverse().toString();
            if (input.equals(reversed)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
    */

    import java.lang.*;
    import java.util.*;
      import java.io.IOException;
      import java.io.InputStreamReader;
      import java.io.BufferedReader;
    
      //program to check palindrome of a string or number
    
      public class Buffered__Reader
      {
        public static void main(String[] args)
        {
          try
            {
                System.out.println("enter a string or a number");
              BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));
              String input=reader.readLine();
              String reversed=new StringBuilder(input).reverse().toString();
              if(reversed.equals(input))
              {
                System.out.println("It is a palindrome");
              }
              else
              {
                System.out.println("not a palindrome");
              }
              
              
              
            }
          catch(IOException e)
            {
              System.out.println("An error occurred");
            }
              
        }
        
      }

