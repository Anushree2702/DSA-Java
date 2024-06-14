import java.util.Scanner;

public class largest_number
{
  public static void main(String[] args) {

    Scanner in =new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c= in.nextInt();
    int d= a+b+c;
    System.out.println(d);
    int max=a;
    if(b>max)
    {
       max=b;
    }
    if(c>max)
    {
        max=c;
    }
    System.out.println(max);
      
    
    }
}
