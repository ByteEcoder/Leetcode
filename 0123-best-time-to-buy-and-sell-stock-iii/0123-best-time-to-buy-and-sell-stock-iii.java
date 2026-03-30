class Solution {
    int n;
    public int maxProfit(int[] prices) {
        n=prices.length;
        int[][][] dp=new int[n][2][2];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i][0], Integer.MIN_VALUE);
            Arrays.fill(dp[i][1], Integer.MIN_VALUE);
        }
        
        return help(0,0,0,dp,prices);
    }
    public int help(int i,int state,int tr,int[][][] dp,int[] prices )
    {
        if(i==n||tr==2)
        return 0;

        if(dp[i][state][tr]!=Integer.MIN_VALUE)
            return dp[i][state][tr];

        int pick=0;
        int nt=0;
        if(state==0)
        {
            pick=-prices[i]+help(i+1,1,tr,dp,prices);
            nt=help(i+1,0,tr,dp,prices);
        }
        if(state!=0)
        {
            pick=prices[i]+help(i+1,0,tr+1,dp,prices);
            nt=help(i+1,1,tr,dp,prices);
        }

        return dp[i][state][tr]=Math.max(pick,nt);
    }
}