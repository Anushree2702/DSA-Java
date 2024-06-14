import java.util.Scanner;

public class counting_occurences1 {
    

    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int count=0;
        System.out.println("enter any number");
        int a = ab.nextInt();
        System.out.println("enter the number you want to search its occurence");
        int c = ab.nextInt();
        while(a!=0){
            int n=a%10;
            a=a/10;
            if(n==c)
            {
               count++ ;
            }
        }
    System.out.println( count);

         
        
    }
}






    

