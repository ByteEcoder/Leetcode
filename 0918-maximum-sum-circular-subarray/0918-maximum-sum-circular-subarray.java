class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        

        int total=0;
        int max_sum=nums[0], min_sum=nums[0];
        int curr_max=0, curr_min=0;

        for(int i:nums)
        {
            total+=i;
            curr_max=Math.max(curr_max+i,i);
            curr_min=Math.min(curr_min+i,i);

            max_sum=Math.max(max_sum,curr_max);
            min_sum=Math.min(min_sum,curr_min);

            
        }

        if(max_sum>0)
            {
                return Math.max(max_sum,total-min_sum);
            }

            
        return max_sum;

    
    }
}