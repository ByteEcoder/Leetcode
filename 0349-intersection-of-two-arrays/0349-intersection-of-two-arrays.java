class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        Set<Integer> result = new HashSet<>();
        for (int j = 0; j < nums2.length; j++) 
            if (set1.contains(nums2[j])) result.add(nums2[j]);
        int[] output = new int[result.size()];
        int k = 0;
        List<Integer> temp = new ArrayList<>(result);
        for (int i = 0; i < temp.size(); i++) output[k++] = temp.get(i);
        return output;
    }
}
