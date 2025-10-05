class Solution {
    public int[] twoSum(int[] num, int target) {
        if (num.length >= 2) 
        {
            for (int i=0;i<num.length;i++)
            {
                for(int j=i+1;j<num.length;j++)
                {
                    if (num[i]+num[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
            
        }
        return new int[]{}; // Return an empty array if no solution is found
    }
}