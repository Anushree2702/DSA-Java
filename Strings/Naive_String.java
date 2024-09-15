package Strings;

public class Naive_String {

    public static void main(String[] args) {
        String text ="1011101010";
        String pattern="111";
        int m=pattern.length();
        int n=text.length();
        for(int i=0 ; i<n ; i++)
        {
            int j;
            for( j=0; j<m ; j++)
            {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
        
        
    }
    
}
