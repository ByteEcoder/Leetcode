class Solution {
    public void rotate(int[] nums, int k) {

       
        int[] res = new int[nums.length];

        int len = k % nums.length;
        int idx = 0;

        for (int i = nums.length - len; i < nums.length; i++) {
            res[idx] = nums[i];
            idx++;
        }

        for (int i = 0; i < nums.length - len; i++) {
            res[idx] = nums[i];
            idx++;
        }

        for (int i = 0; i <nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
