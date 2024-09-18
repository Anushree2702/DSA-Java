package Strings;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome. */

public class Valid_palindrome_1 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String a="race a car";
        System.out.println(validpalindrome(s));
        System.out.println(validpalindrome(a));
        
    }
    static boolean validpalindrome(String s)
    {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    
}
