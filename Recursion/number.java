package Recursion;

public class number {
    public static void main(String[] args) {
        num(4);
        
    }
    static void num(int num)
    {
      if(num==10)
      {
         return;
      }
       System.out.println(num);
       num(num+1); 
      
    }
   
    
}
