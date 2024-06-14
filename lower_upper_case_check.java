import java.util.Scanner;

public class lower_upper_case_check
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a =in.next();
    System.out.println(a);

    String b= a.toLowerCase();
    String c= a.toUpperCase();

    if(a==b)
    {
        System.out.println("lower");
    }
    else{
        System.out.println("upper");
    }
  }
}