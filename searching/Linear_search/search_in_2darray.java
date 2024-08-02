package searching.Linear_search;

import java.util.Arrays;

public class search_in_2darray {
    static int[] search(int[][] arr ,int target)
    {
        for(int i=0 ; i<arr.length ;i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{44,5,6,7},{88,99,9,80}};
        int target=0;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
        

    }
    
}
