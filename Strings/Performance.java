package Strings;

public class Performance {
    public static void main(String[] args) {

        //concatenation

        System.out.println("a"+"b");
        System.out.println("a"+1);
        System.out.println("a"+"b"+"cv");



        //performance

        
        String series="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);
        
    }
    
}
