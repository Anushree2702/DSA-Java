import java.util.Scanner;

public class switch_expression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "mango":
                System.out.println("king");
                break;

            case "grapes":
                System.out.println("small fruit");
                break;
            
            case "orange":
                System.out.println("vitamin c ");
                break;

            case "watermelon":
               System.out.println("big fruit");
               break;
            
            case "apple":
               System.out.println("red fruit");
               break;
        
            default:
                System.out.println("please enter a valid fruit");
                break;
        }
    }
    
}
