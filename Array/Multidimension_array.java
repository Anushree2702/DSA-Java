package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_array {
    public static void main(String[] args) {
        
    
        int[][] arr=new int[4][4];
        Scanner in=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
           // for(int j=0 ; j<arr[i].length ; j++)
           // {
                System.out.print(Arrays.toString(arr[i]));
            //}
            System.out.println();
            
        }
    }
}
