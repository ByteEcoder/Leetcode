class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int k=0;
        while(k<nums.length)
        {
            sum+=nums[k];
            k++;
        }

        if(sum%2!=0)
        return false;

        Boolean dp[][]=new Boolean[nums.length+1][sum/2+1];

       return check(dp,nums,0,sum/2);
    }

    public boolean check(Boolean dp[][],int[] nums,int i,int target)
    {
        if(target==0)
            return true;
        
        if( i==nums.length || target<0 )
            return false;

        
        if(dp[i][target]!=null)
            return dp[i][target];

        
        dp[i][target]=check(dp,nums,i+1,target-nums[i])||check(dp,nums,i+1,target);

        return dp[i][target];

    }
}