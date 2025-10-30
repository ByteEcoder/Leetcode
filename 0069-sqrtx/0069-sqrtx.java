class Solution {
    public int mySqrt(int x) {
        if (x==0 || x==1)
            return x;
        int high = x/2;
        int low =0;
        int result=0;
        while (low<=high)
        {
            int mid=(low+high)/2;
            long sq=(long)mid*mid;

                if(sq==x)
                    return mid;

                else if (sq <x)
                {
                    result=mid;
                    low=mid+1;
                }
                else 
                {   
                    high= mid-1;
                    
                }
        }
        return result;
    }
}