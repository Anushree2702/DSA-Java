import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter a number");
        int n = a.nextInt();
        int m=0;
        int b;
        while (n!=0)
        {
            b=n%10;
            n=n/10;
            m=m*10+b;
        }
    System.out.println(m);
    }
    
}
