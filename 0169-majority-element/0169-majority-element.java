class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        int count=0;
        int major=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>count)
                    {count=map.get(nums[i]);
                    major=nums[i];
                    }

            }
            else
            map.put(nums[i],1);
        }
       return major;

        
    }
}