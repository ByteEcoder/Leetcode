class Solution {
    int n,m;
    public int minOperations(int[][] grid, int x) {
        
        m=grid.length;
        n=grid[0].length;

        int arr[]= new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k]=grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
       int mid=0;
        if(check(arr,x)==false)
            return -1;

        mid=arr[n*m/2];
        
        int opp=0;
        for(int key:arr)
        {
            opp+=Math.abs(key-mid)/x;
        }

        return opp;
        
    }

    public boolean check(int[] arr,int x)
    {
         int co=arr[0]%x;
        for(int l=1;l<n*m;l++)
        {
            if(co!=arr[l]%x)
                return false;
        }
        return true;
    }
    
}