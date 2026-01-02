class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=0,n=nums.length;
        int i=0;
        while(i<nums.length)
        {
            sum+=nums[i];
            i++;
        }

        return (n*(n+1)/2)-sum;

    }
}