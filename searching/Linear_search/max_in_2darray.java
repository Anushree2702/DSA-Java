package searching.Linear_search;

public class max_in_2darray {
    static int max(int[][] arr )
    {
        int maximum=arr[0][0];
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                if(maximum<arr[i][j])
                {
                    maximum=arr[i][j];
                    
                }

            }
        }
        return maximum;

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{22,33,5},{100,6,199}};
        System.out.println(max(arr));

        
    }
    
}
