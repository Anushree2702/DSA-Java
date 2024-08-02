package searching.Linear_search;

public class richest_customer_wealth {
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int person=0 ; person<accounts.length ; person++)
        {
            int sum=0;
            for(int account=0 ; account<accounts[person].length ; account++)
            {
                sum=sum+accounts[person][account];

            }
            if(ans<sum)
            {
                ans=sum;
            }
        }
        return ans;
        
        
    }
    public static void main(String[] args) {
        int[][] accounts ={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
        
    }
    
}
