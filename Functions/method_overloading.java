package Functions;

public class method_overloading {

    static int sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("first one ");
        System.out.println(sum);
        return sum;
    }

    static void sum(int a , int b , int c)
    {
        int sum= a+b+c;
        System.out.println("secomd one");
        System.out.println(sum);
        
    }
    public static void main(String[] args) {

        sum(2,3);
        sum(2, 03, 04);
        
    }
    
}
