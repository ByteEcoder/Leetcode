class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int n = nums.length;
        map.put(0,-1);
        if(n<2)
            return false;
            
        for(int i=0; i<n; i++){
            sum +=nums[i];

            if(map.containsKey(sum % k))
                {
                    if(i-map.get(sum % k) >=2)
                        return true;
                }
            else    
                map.put(sum % k, i);
                
                
            
            
        }
        return false;
        
    }
}