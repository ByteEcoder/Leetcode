class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        List<List<Integer>> graph=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1&&  i!=j)
                {
                    graph.get(i).add(j);
                }
            }
        }
        boolean visit[]=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
                count=bfs(visit,graph,count,i);
            }
        }
        return count;
        
    }

    public int bfs(boolean visit[],List<List<Integer>> graph,int count,int start)
    {
        count++;
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visit[start] = true;

        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int neigh:graph.get(node))
            {
                if(!visit[neigh])
                {
                    visit[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        return count;
    }
}
