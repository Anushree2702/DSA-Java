package searching.Linear_search;

import java.util.Arrays;

public class search_in_string {
    public static void main(String[] args) {
        String str="ANushree";
        char target='E';
         System.out.println(search(str, target));
         System.out.println(Arrays.toString(str.toCharArray()));
        
    }
    static boolean search(String str , char target)
    {
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==target)
            {
                return true;

            }

        }
        return false;
    }
}
