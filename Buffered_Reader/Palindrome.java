import java.lang.*
import java.util.*
  import java.io.IOException
  import java.io.InputStreamReader
  import java.io.BufferedReader

  //program to check palindrome of a string or number

  public class Buffered_Reader
  {
    public static void main(String[] args)
    {
      try
        {
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
