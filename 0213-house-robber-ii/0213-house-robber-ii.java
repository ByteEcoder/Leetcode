class Solution {
    int n;
    public int rob(int[] nums) {
        n=nums.length;
        if(n==1)
            return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int a=check(nums,dp,0,n-2);

        Arrays.fill(dp,-1);
        int b=check(nums,dp,1,n-1);
        return Math.max(a,b);

    }
    public int check(int[] nums, int[] dp,int i,int j)
    {
        if(i>j)
        return 0;

        if(dp[i]!=-1)
            return dp[i];
        
        int pick=nums[i]+check(nums,dp,i+2,j);
        int skip=check(nums,dp,i+1,j);

        return dp[i]=Math.max(pick,skip);
    }
}