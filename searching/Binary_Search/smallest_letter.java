package searching.Binary_Search;

public class smallest_letter {
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
            int end=letters.length-1;
            if(target>letters[end])
            {
                return 0;
            }
            while(start<=end)
            {
            int mid=(start)+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            }
            return letters[start % letters.length];
    

        
    }
    public static void main(String[] args) {
        
    }
    
}
