class Solution {
    public boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            long midsqr=(long) mid*mid;
            if(midsqr>num)
            {
                end=mid-1;

            }
            if(midsqr<num)
            {
                start=mid+1;
            }
            if(midsqr==num)
            {
                return true;
            }
        }
        return false;
        
    }
}
