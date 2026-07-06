class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String pre=strs[0];

        for(String word:strs)
        {
            int index=Math.min(word.length(),pre.length());
            int x=0;
            for(int i=0;i<index;i++)
            {
                if(i==index||word.charAt(i)!=pre.charAt(i))
                    {
                    break;
                    }
                x++;
            }

            pre=pre.substring(0,x);
        }

        return pre;
    }
}