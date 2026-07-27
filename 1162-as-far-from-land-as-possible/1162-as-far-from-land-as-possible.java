class Solution {
    int n,m;
    public int maxDistance(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        
        boolean visit[][] =new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        int zero=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    q.add(new int[]{i,j});
                    visit[i][j]=true;
                }
                else
                    zero++;
            }
        }

        if(zero==0)
            return -1;

        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int a=cur[0];
            int b=cur[1];

            if(b-1>=0 && !visit[a][b-1] && grid[a][b-1]==0)//left
                {
                    grid[a][b-1]=grid[a][b]+1;
                    q.add(new int[]{a,b-1});
                    visit[a][b-1]=true;
                }
            if(b+1<m && !visit[a][b+1] && grid[a][b+1]==0)//right
                {
                    grid[a][b+1]=grid[a][b]+1;
                    q.add(new int[]{a,b+1});
                    visit[a][b+1]=true;
                }
            if(a-1>=0 && !visit[a-1][b] && grid[a-1][b]==0)//top
                {
                    grid[a-1][b]=grid[a][b]+1;
                    q.add(new int[]{a-1,b});
                    visit[a-1][b]=true;
                }
            if(a+1<n && !visit[a+1][b] && grid[a+1][b]==0)//bottom
                {
                    grid[a+1][b]=grid[a][b]+1;
                    q.add(new int[]{a+1,b});
                    visit[a+1][b]=true;
                }
        }
        
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res=Math.max(res,grid[i][j]);
            }
        }
        return res-1;
    }
}