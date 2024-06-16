package Functions;

import java.util.Scanner;

public class function_with_stringargument {
    static String greet(String a, String b)
    {
        String c = a+b;
        System.out.println(c);
        return c;
    }

    static String mygreet(String name)
    {
        String message = "Hello " + name ;
        System.out.println(message);
        return message;
    }

    static String greetings(String name , String age)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter your name ");
        name=in.next();
        System.out.println("enter your age");
        age=in.next();
        String message = "Hello " + name + " your current age is " + age ;
        System.out.println(message);
        return message;

    }
    public static void main(String[] args) {
       
        greet("hello ", "world !");
        greet("Anushree ","Srivastava");

        mygreet("Serkan");
        mygreet("Byeon woo seok");

        greetings(null, null);
        greetings(null, null);

       // greetings("Kim Soo Hyun", "30");
       // greetings("Haein", "29");

    }
    
}
