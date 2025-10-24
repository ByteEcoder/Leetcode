class Solution {
    public void sortColors(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;
        int mid = 0;  

        while (mid <= ei) { 
            if (nums[mid] == 0)
            {
                int temp = nums[si];
                nums[si] = nums[mid];
                nums[mid] = temp;
                si++;
                mid++;
            }
            else if (nums[mid] == 1) 
            {
                mid++;
            } 
            else 
            {
                int temp = nums[mid];
                nums[mid] = nums[ei];
                nums[ei] = temp;
                ei--;
            }
        }
    }
}
