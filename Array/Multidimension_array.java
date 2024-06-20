package Array;

import java.util.Scanner;

public class Multidimension_array {
    public static void main(String[] args) {
        
    
    int[][] arr = new int[2][2];
    Scanner in = new Scanner(System.in);

    //input

    for (int row =0 ; row<=arr.length; row++)
    {
        for(int col=0 ; col<arr[row].length ; col++)
        {
            arr[row][col]=in.nextInt();
        }
    }

    //output

    for (int row  =0 ; row<=arr.length; row++)
    {
        for(int col=0 ; col<arr[row].length ; col++)
        {
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }
}
    
}
