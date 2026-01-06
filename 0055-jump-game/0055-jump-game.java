class Solution {
    public boolean canJump(int[] nums) {
      int max=nums[0];
        int i=0;
      while(i<nums.length&&i<=max)
      {
        if(i+nums[i]>max)
            max=i+nums[i];
        
        
        i++;


      }

      if(max>=nums.length-1)
        return true;


      return false;

    }
}