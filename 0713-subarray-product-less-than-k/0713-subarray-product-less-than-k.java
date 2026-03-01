class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int max=0;
        int prod=1;
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            prod*=nums[i];
            while(l<=i && prod>=k)
            {
                prod/=nums[l];
                l++;
            }
            max+=i-l+1;
         
        }
        return max;
    }
}