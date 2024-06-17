package Functions;

import java.util.Arrays;

public class method_overloading_VarArgs {

    static void hello(int ...v)
    {
        System.out.println("first one");
        System.out.println(Arrays.toString(v));

    }

    static void hello(String ...v)
    {
        System.out.println("second one");
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {

        hello(2,3,4,5,6,7,8,9);
        hello("hello","xukai");

        
        hello();    // ambiguity
        
    }
    
}
