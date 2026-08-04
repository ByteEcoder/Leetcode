class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       
        Set<Integer> ar=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            {
                ar.add(nums[i]);
            }

        Arrays.sort(nums);
        List<Integer> missing =new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        for (int i=min;i<=max;i++)
            {
                if ( !ar.contains(i))
                    missing.add(i);
            }

        return missing;
        
            
    }
}