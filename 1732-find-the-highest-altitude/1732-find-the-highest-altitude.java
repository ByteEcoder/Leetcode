class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] alt=new int[gain.length+1];
        int max_alt=0;
        for(int i=0;i<gain.length;i++)
        {
            alt[i+1]=alt[i]+gain[i];
            max_alt=Math.max(max_alt,alt[i+1]);
        }

        return max_alt;

        
    }
}