class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;

        boolean visit[][] = new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(isWater[i][j]==1)
                  {  
                    q.add(new int[]{i,j});
                    isWater[i][j]=0;
                    visit[i][j]=true;
                  }

            }
        }

        while(!q.isEmpty())
        {
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];

            if(c-1>=0 && !visit[r][c-1] && isWater[r][c-1]==0)//left 
            {
                isWater[r][c-1]=isWater[r][c]+1;
                visit[r][c-1]=true;
                q.add(new int[]{r,c-1});
            }
            if(c+1<m && !visit[r][c+1] && isWater[r][c+1]==0)//left 
            {
                isWater[r][c+1]=isWater[r][c]+1;
                visit[r][c+1]=true;
                q.add(new int[]{r,c+1});
            }
            if(r-1>=0 && !visit[r-1][c] && isWater[r-1][c]==0)//left 
            {
                isWater[r-1][c]=isWater[r][c]+1;
                visit[r-1][c]=true;
                q.add(new int[]{r-1,c});
            }
            if(r+1<n && !visit[r+1][c] && isWater[r+1][c]==0)//left 
            {
                isWater[r+1][c]=isWater[r][c]+1;
                visit[r+1][c]=true;
                q.add(new int[]{r+1,c});
            }

        }

        return isWater;
    }
}