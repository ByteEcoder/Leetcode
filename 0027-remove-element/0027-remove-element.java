class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to track the new length of the array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; // Move valid element to index position
                index++; // Increment index
            }
        }
        
        return index; // Return new length after removing elements
    }
}
