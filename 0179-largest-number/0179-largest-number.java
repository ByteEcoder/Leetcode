class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;

        String[] ele=new String[n];

        for(int i=0;i<n;i++)
        {
            ele[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(ele,new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                String first=a+b;
                String sec=b+a;
                return sec.compareTo(first);

            }
        }
        );

        if(ele[0].equals("0"))
            return "0";
        String res="";
        for(String val:ele)
        {
            res+=val;
        }

        return res;
    }
}