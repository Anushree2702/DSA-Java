package Functions;

public class scope {
    
    public static void main(String[] args) {

        //In Java, variables are only accessible inside the region they are created. This is called scope.
        int a =10;
        int b=20;
        
        {
            a=100;
            //int b=56;  // values can not be reinitialised
            System.out.println(a);  // values can be reassigned 
            int c=30;
            System.out.println(c);
        }
        //System.out.println(c); //ERROR   { c is not accessible outside the block}
        System.out.println(a);
    }
    
}
