package Functions;

public class shadowing {
    static int a=10;
    static void run()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a= 20; // the class variable at line 4 is shadowed by this
        {
            a=30;  // the class variable at line 4 is shadowed by this
            System.out.println(a);
        }
        System.out.println(a);
        run();

        
    }
    
}
