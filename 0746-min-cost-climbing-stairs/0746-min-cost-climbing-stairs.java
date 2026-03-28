class Solution {
    int n;
    public int minCostClimbingStairs(int[] cost) {
        n=cost.length;
        int dp[]=new int[n];

        Arrays.fill(dp,Integer.MAX_VALUE);
        return Math.min(help(dp,cost,0),help(dp,cost,1));
        
    }
    public int help(int[] dp,int[] cost, int i)
    {
        if(i>n-1)
        return 0;

        if(dp[i]!=Integer.MAX_VALUE)
            return dp[i];

        int pick=cost[i]+help(dp,cost,i+1);
        int alt=cost[i]+help(dp,cost,i+2);

        dp[i]=Math.min(pick,alt);
        return dp[i];
    }
}