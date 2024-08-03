package Array;

public class reverse_integer {
    static int reverse_int(int x)
    {
        
        int b=0;
       
       
        while(x!=0)
        {
            int a=x%10;
            b=b*10+a;
            x=x/10;
           
        }
        System.out.println(b);
        
        return b;
        //1534236469

    }
    public static void main(String[] args) {
        reverse_int(1534234689);
        
    }  
}







