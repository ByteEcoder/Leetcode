class Solution {
    int res;
    public int singleNonDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            res=res^nums[i];
        }

        return res;
    }
}