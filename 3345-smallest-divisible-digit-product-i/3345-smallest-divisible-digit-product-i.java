class Solution {
    
    public int smallestNumber(int n, int t) {
       while(true)
       {
        if(pro(n)%t==0)
            return n;
        n++;
       }
       
    }
    int pro(int n)
    {
        int a=n;
        int product=1;
        while(a>0)
        {
            product*=(a%10);
            a=a/10;
        }

        return product;
    }
}