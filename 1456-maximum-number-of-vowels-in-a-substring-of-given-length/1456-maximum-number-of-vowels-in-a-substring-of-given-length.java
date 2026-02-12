class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max_count=0;


        for(int j=0;j<k;j++)
        {
            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
                count++;
        }
        max_count=count;

        for(int i=k;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                count++;
            
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u')
                count--;

            max_count=Math.max(max_count, count);
        }

        return max_count;
    }
}