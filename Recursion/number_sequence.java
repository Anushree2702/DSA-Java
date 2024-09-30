package Recursion;

public class num_sequence {
    public static void main(String[] args) {
        //num(5);
        numbothsequence(5);
        
    }

    //if you want to print number in sequence like ---- 5 4 3 2 1 1 2 3 4 5

    static void numbothsequence(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        numbothsequence(num-1);
        System.out.println((num));
    }
    





    /*static void num(int num)
    {
      if(num==10)
      {
         return;
      }
       System.out.println(num);
       num(num+1); 
      
    }
       */



       

       /*             //prints   4 3 2 1

       static void num(int num)
       {
        if (num==0)
        {
            return;
        }
        System.out.println(num);
        num(num-1);
       }
        */


   
    
}
