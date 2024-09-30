package Recursion;

public class Prod_of_digits {
    public static void main(String[] args) {
        System.out.println(pro(12345670));
        
    }
    static int pro(int num)
    {
        if(num%10==num)
        {
            return num;
        }
        return num%10*pro(num/10);
    }
    
}
