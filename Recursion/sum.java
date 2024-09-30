package Recursion;

public class sum {
    public static void main(String[] args) {
       System.out.println(sum(4)); 
    }
    static int sum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        return num+sum(num-1);
    }
    
}
