package Functions;

import java.util.Arrays;

public class VarArgs {

    static void fun2(int a, int b, String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun( int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {

        fun(1,2,3,4,5,6,7,8,9,11);
        fun2(22, 234, "hello", " byee ");
        
    }
    
}
