package Array;

public class column_not_fixed_in2Darray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {2,3,5},
            {1,23,45,5,6}};
        
        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    
}
