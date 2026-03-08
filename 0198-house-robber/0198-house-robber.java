class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return check(nums,nums.length-1,dp);

    }
    public int check(int[] nums,int i,int[] dp)
    {
        if(i<0)
            return 0;

        if(dp[i]!=-1)
            return dp[i];
        
        return dp[i]=Math.max(check(nums,i-1,dp),nums[i]+check(nums,i-2,dp));
    }
}