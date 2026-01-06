class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;
        int i = 0;

        while (i < nums.length - 1) {
            farthest = Math.max(farthest, i + nums[i]);

            
            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }
            i++;
        }
        return jumps;
    }
}