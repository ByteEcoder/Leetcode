class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> com= new HashMap<>();
       for (int i =0;i<nums.length;i++)
       {
        if (com.containsKey(nums[i]) && i-(com.get(nums[i]))<=k)
            return true;

        com.put(nums[i],i);
       }

       return false;
    }
}