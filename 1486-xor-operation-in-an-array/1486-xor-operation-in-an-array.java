class Solution {
    int res;
    public int xorOperation(int n, int start) {
        

        for(int i=0;i<n;i++)
        {
            res=res^(start+2*i);
        }
        return res;

    }
}