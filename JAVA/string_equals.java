import java.util.Scanner;

public class string_equals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        if(fruits.equals("mango"))
        {
            System.out.println("king");

        }
        if (fruits.equals("orange"))
        {
            System.out.println("cute");

        }
        if (fruits.equals("grapes"))
        {
            System.out.println("small");

        }
        else{
            System.out.println("invalid");
        }
    }
    
}
