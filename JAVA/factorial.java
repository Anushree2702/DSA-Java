import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n=sb.nextInt();
        int fact=1;
        for(int i=2; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);

    }
    
}
