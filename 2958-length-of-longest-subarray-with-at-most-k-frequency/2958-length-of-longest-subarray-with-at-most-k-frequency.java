class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        int len=0;
        int h=0;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.get(nums[i])>k)
            {
                //shrink
                if(map.containsKey(nums[h]) && map.get(nums[h])==1)
                {
                    map.remove(nums[h]);
                }
                else
                map.put(nums[h],map.get(nums[h])-1);

                h++;
                
            }
            len=Math.max(len,i-h+1);
        }
        return len;
    }
}