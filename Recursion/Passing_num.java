package Recursion;

public class Passing_num {
    public static void main(String[] args) {
        num(7);
    }
    static void num(int n)
    {
        if(n==0)
        {
            return;
        }
        //num(n--);               //returns infinite loop (stack overflow)
        System.out.println(n);
        num(--n);
        System.out.println(n);
    }
    
}
