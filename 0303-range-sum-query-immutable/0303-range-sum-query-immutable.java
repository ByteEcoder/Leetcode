class NumArray {
    int[] nums;
    int sum;
    public NumArray(int[] nums) {
       this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        if(left>right)
            return 0;
       

        return nums[left]+sumRange(left+1,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */