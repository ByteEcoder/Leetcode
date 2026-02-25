class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int currmax=0;
        int l=0;

        for(int right=0;right<nums.length;right++)
        {
            if(map.containsKey(nums[right]))
            {
                while(l<=map.get(nums[right]))
                {
                    currmax-=nums[l];
                    l++;
                }

                map.put(nums[right],right);
            }

            currmax+=nums[right];
            map.put(nums[right],right);
            maxi=Math.max(maxi,currmax);
        }
        return maxi;
    }
}