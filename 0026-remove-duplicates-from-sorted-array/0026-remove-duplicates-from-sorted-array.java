class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        if (n>-1){
        while (j<n && i<n)
        {
            if (nums[i]!= nums[j])
            {   i++;
                nums[i]=nums[j];
            
            }
            
             j++;
        }
        }
        return i+1;
    }
}